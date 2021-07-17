/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 셔틀버스
 * created on 2021.07.18
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        int answer = 9*60;
        
        //크루들 도착시간 오름차순 정렬
        Arrays.sort(timetable);
        
        //셔틀 도착시간
        int time = 9*60; //09:00
        int shuttle = 1; //몇번째 셔틀버스인지
        int count = 0; //이번 셔틀버스에 타는 사람 수
        int last = 0; //마지막으로 탄 사람이 도착한 시각
        
        int i=0;
        for (i=0;i<timetable.length;i++) {
            //크루원이 도착한 시각
            int crew = Integer.parseInt(timetable[i].substring(0,2))*60
                + Integer.parseInt(timetable[i].substring(3,5));

            // 마지막 셔틀버스가 아닌 경우
            if (shuttle < n) {

                // 셔틀버스보다 늦게 도착한 경우
                // 다음 셔틀버스 타야 함
                if (time < crew) {
                    shuttle++;
                    count = 0;

                    // 다음 셔틀버스 도착시각
                    time += t;
                    i--;
                }
                // 셔틀버스 타기
                else {
                    count++;
                    
                    if (count == m) {
                        shuttle++;
                        count = 0;
                        time += t;
                    }

                    if (last != crew) last = crew;
                }
            }
            
            // 마지막 셔틀버스인 경우
            else {

                // 셔틀버스보다 늦게 도착한 경우
                // 다음 셔틀버스 타야 함
                if (time < crew) {
                    answer = time;
                    i--;
                    break;
                }
                // 셔틀버스 타기
                else {
                    count++;
                    
                    if (count == m) {
                        answer = crew-1;
                        i--;
                        break;
                    }

                    if (last != crew) last = crew;
                }
            }
        }
        
        // 내가 탈 셔틀버스에 자리가 남는 경우
        if (count < m) {
            answer = time;
        }
        // 모든 사람이 셔틀버스를 탈 수 있는 경우
        else if (timetable.length == i) {
            answer = 9*60+(n-1)*t;
        }
        
        // 시간 형식에 맞춰 출력
        return String.format("%02d:%02d", answer/60, answer%60);
    }
}
/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 추석 트래픽
 * created on 2021.04.26
 * created by jionchu */

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        
        int[][] times = new int[lines.length][2];
        
        //시작시간, 끝시간 저장
        for (int i=0;i<lines.length;i++) {
            String[] log = lines[i].split(" ");
            String[] response = log[1].split(":");
            
            //처리시간
            int process = (int)(Double.parseDouble(log[2].substring(0,log[2].length()-1)) * 1000);
            
            int end = 0; //시작시간 계산
            end += Integer.parseInt(response[0]) * 60 * 60 * 1000;
            end += Integer.parseInt(response[1]) * 60 * 1000;
            end += (int)(Double.parseDouble(response[2]) * 1000);    
            int start = end - process + 1; //끝시간 계산
            
            //저장
            times[i][0] = start;
            times[i][1] = end;
        }
        
        //시작시간, 끝시간마다 처리개수 계산
        int count = 0, time = 0;
        for (int i=0;i<times.length;i++) {
            //시작시간부터 1초동안 처리개수 계산
            count = 0;
            time = times[i][0];
            for (int j=0;j<times.length;j++) {
                if (times[j][0] <= time && times[j][1] >= time) count++;
                else if (times[j][0] >= time && times[j][0] <= time + 999) count++;
            }
            
            if (count > answer) answer = count;
            
            //끝시간부터 1초동안 처리개수 계산
            count = 0;
            time = times[i][1];
            for (int j=0;j<times.length;j++) {
                if (times[j][0] <= time && times[j][1] >= time) count++;
                else if (times[j][0] >= time && times[j][0] <= time + 999) count++;
            }
            
            if (count > answer) answer = count;
        }
        
        return answer;
    }
}

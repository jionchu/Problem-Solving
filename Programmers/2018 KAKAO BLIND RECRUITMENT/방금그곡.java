/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [3차] 방금그곡
 * created on 2021.07.06
 * created by jionchu */

class Solution {
    public String solution(String m, String[] musicinfos) {
        
        String answer = "(None)";
        
        // 기억하는 멜로디
        String target = changeNotes(m);
        
        int playingTime = 0;
        
        // 각 음악에 대해 반복
        for (String musicInfo: musicinfos) {
            
            String[] infos = musicInfo.split(",");
            
            // 음악이 재생된 총 시간 계산
            String[] startTimes = infos[0].split(":");
            String[] endTimes = infos[1].split(":");
            
            int startHour = Integer.parseInt(startTimes[0]);
            int startMinute = Integer.parseInt(startTimes[1]);
            int endHour = Integer.parseInt(endTimes[0]);
            int endMinute = Integer.parseInt(endTimes[1]);
            
            int mins = 60*(endHour-startHour) + endMinute-startMinute;
            
            // 라디오에서 재생된 시간이 더 긴 경우만 확인
            if (mins > playingTime) {

                // 현재 음악의 전체 음들
                char[] notes = changeNotes(infos[3]).toCharArray();

                // 총 시간동안 재생된 음들
                StringBuilder sb = new StringBuilder();
                int count = 0;
                while (count < mins) {
                    sb.append(notes[count%notes.length]);
                    count++;
                }

                // 기억한 멜로디와 일치하는 구간이 있는 경우
                if (sb.toString().contains(target)) {
                    answer = infos[2];
                    playingTime = mins;
                }
            }
        }
        
        return answer;
    }
    
    // #을 포함한 음들을 다른 기호로 변경
    public String changeNotes(String notes) {
        
        // A#:H, C#:I, D#:J, F#:K, G#:L
        notes = notes.replaceAll("A#", "H");
        notes = notes.replaceAll("C#", "I");
        notes = notes.replaceAll("D#", "J");
        notes = notes.replaceAll("F#", "K");
        notes = notes.replaceAll("G#", "L");
        
        return notes;
    }
}
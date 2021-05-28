/* Programmers
 * 월간 코드 챌린지 시즌1 - 이진 변환 반복하기
 * created on 2021.05.29
 * created by jionchu */

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        StringBuilder sb = new StringBuilder(s);
        
        //s가 "1"이 될 때까지 반복
        while (!sb.toString().equals("1")) {
            //이진 변환 횟수 증가
            answer[0]++;
            
            //모든 0 제거
            for (int i=0;i<sb.length();i++) {
                if (sb.charAt(i) == '0') {
                    sb.deleteCharAt(i);
                    i--;
                    //제거된 0의 개수 증가
                    answer[1]++;
                }
            }
            
            //길이를 2진법으로 표현
            int length = sb.length();
            sb = new StringBuilder();
            while (length > 0) {
                sb.insert(0,length%2);
                length/=2;
            }
        }
        
        return answer;
    }
}
/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 비밀지도
 * created on 2021.01.27
 * created by jionchu */

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //지도 1과 지도 2를 합친 지도
        char[][] map = new char[n][n];

        String num1 = "";
        String num2 = "";
        for (int i=0;i<n;i++) {
            //2진수로 변환
            num1 = Integer.toBinaryString(arr1[i]);
            num2 = Integer.toBinaryString(arr2[i]);
            
            //지도 1의 벽 부분을 표시
            for (int j=0;j<num1.length();j++) {
                if (num1.charAt(j) == '1')
                    map[i][j+n-num1.length()] = '#';
            }
            //지도 2의 벽 부분을 표시
            for (int j=0;j<num2.length();j++) {
                if (num2.charAt(j) == '1')
                    map[i][j+n-num2.length()] = '#';
            }
        }
        
        String[] answer = new String[n];
        //지도의 각 가로줄을 하나의 문자열로 변환
        for (int i=0;i<n;i++) {
            //벽('#')이 아닌 부분은 공백(' ')으로 변경
            answer[i] = String.valueOf(map[i]).replace('\0',' ');
        }
        
        return answer;
    }
}
/* Programmers
 * 연습문제 - 최댓값과 최솟값
 * created on 2021.03.12
 * created by jionchu */

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" "); //공백을 기준으로 숫자들 분리
        int min = Integer.parseInt(numbers[0]); //최솟값 초기값 설정
        int max = min; //최댓값 초기값 설정
        for (int i=1;i<numbers.length;i++) {
            //각 숫자가 min보다 작거나 max보다 큰 경우 update
            int n = Integer.parseInt(numbers[i]);
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        return min+" "+max;
    }
}
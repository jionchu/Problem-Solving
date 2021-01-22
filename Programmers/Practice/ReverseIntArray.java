/* Programmers
 * 연습문제 - 자연수 뒤집어 배열로 만들기
 * created on 2021.01.22
 * created by jionchu */

class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        //각 자리수를 순서를 뒤집어 배열에 담음
        for (int i=0;i<num.length();i++) {
            answer[i] = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
        }
        return answer;
    }
}
/* Programmers
 * 연습문제 - 콜라츠 추측
 * created on 2021.01.23
 * created by jionchu */

class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(answer <= 500) { //최대 500번 반복
            if (n == 1) //1이 될 때까지 반복
                return answer;
            if (n % 2 == 0) //짝수라면
                n /= 2;
            else //홀수라면
                n = n * 3 + 1;
            answer++;
        }
        //500번 반복해도 1이 되지 않는 경우
        return -1;
    }
}
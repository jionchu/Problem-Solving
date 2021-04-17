/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 다트 게임
 * created on 2021.02.02
 * created by jionchu */

 class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3]; //기회마다 획득 점수 저장
        int chance = -1; //몇번째 기회인지
        char[] chars = dartResult.toCharArray();
        for (int i=0;i<chars.length;i++) {
            char ch = chars[i];
            if (ch >= '0' && ch <= '9') { //점수
                if (i > 0 && dartResult.charAt(i-1) == '1')
                    scores[chance] = 10; //이전 인덱스의 문자가 숫자인 경우: 10
                else scores[++chance] = ch-'0';
            }
            else if (ch == 'D') //2제곱
                scores[chance] = scores[chance]*scores[chance];
            else if (ch == 'T') //3제곱
                scores[chance] = scores[chance]*scores[chance]*scores[chance];
            else if (ch == '*') { //스타상
                if (chance > 0)
                    scores[chance-1] = scores[chance-1]*2;
                scores[chance] = scores[chance]*2;
            } else if (ch == '#') //아차상
                scores[chance] = scores[chance]*(-1);
        }
        
        int answer = 0; //최종 점수 계산
        for (int i=0;i<3;i++)
            answer += scores[i];
        return answer;
    }
}
/* E-PPER 15회
 * Q5: 문자열 압축
 * created on 2021.03.16
 * created by jionchu */

public class Q5 {
    public static void main(String[] args) {
        String src = "111100100011";

        String solution = new Solution().solution(src);
        System.out.println(solution);
        //1DBACB
    }

    public static class Solution {
        public String solution(String src) {
            StringBuilder sb = new StringBuilder();
            char[] sentence = src.toCharArray();
            if (sentence[0] == '1') { //1로 시작하는 경우
                sb.append('1');
            }

            int count = 1;
            char prev = sentence[0];
            for (int i=1;i<sentence.length;i++) {
                char word = sentence[i];
                if (word == prev) { //같은 숫자가 연속으로 등장하는 경우
                    count++; //개수 증가
                } else { //다른 숫자가 등장하는 경우
                    sb.append((char)('A'+count-1)); //이전 숫자가 몇개였는지 변환
                    prev = word; //현재 숫자 저장
                    count = 1; //개수 업데이트
                }
            }

            sb.append((char)('A'+count-1)); //마지막 숫자 압축
            return sb.toString();
        }
    }
}

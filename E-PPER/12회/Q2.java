/* E-PPER 12회
 * Q2: 오리엔테이션 번호표
 * created on 2021.03.14
 * created by jionchu */

public class Q2 {
    public static void main(String[] args) {
        int n = 30;

        String solution = new Solution().solution(n);
        System.out.println(solution);
        //2 15
    }

    public static class Solution {
        public String solution(int n) {
            int room = (n - 1) / 15 + 1; //방 번호
            int num = (n - 1) % 15 + 1; //방안에서의 번호
            return room + " " + num;
        }
    }
}

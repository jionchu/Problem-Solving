/* E-PPER 13회
 * Q2: 거스름돈
 * created on 2021.03.14
 * created by jionchu */

public class Q2 {
    public static void main(String[] args) {
        int m = 10000;
        int n = 8240;

        String solution = new Solution().solution(m,n);
        System.out.println(solution);
        //5 6
    }

    public static class Solution {
        private int type, count, change;

        public String solution(int m, int n) {
            type = 0;
            count = 0;
            change = m - n;

            pay(50000);
            pay(10000);
            pay(5000);
            pay(1000);
            pay(500);
            pay(100);
            pay(50);
            pay(10);

            return type + " " + count;
        }

        public void pay(int unit) {
            if (change / unit > 0) { //지불 가능한 경우
                type++; //화폐 종류 개수 증가
                count += change / unit; //총 화폐 개수 증가
                change %= unit; //남은 거스름돈 계산
            }
        }
    }

}

/* E-PPER 13회
 * Q9: 돈 줍기
 * created on 2021.03.22
 * created by jionchu */

public class Q9 {
    public static void main(String[] args) {
        int[] money = {5, 7, 10, 1, 2, 10, 10, 8};

        int solution = new Solution().solution(money);
        System.out.println(solution);
        //37
    }

    public static class Solution {
        public int solution(int[] money) {
            //각 단계별 주울 수 있는 최대 금액 배열
            int[] max = new int[money.length+1];
            
            max[0] = 0;
            max[1] = money[0]; //첫번째 돈을 주운 경우
            max[2] = money[0] + money[1]; //첫번째, 두번째 돈을 모두 주운 경우

            for (int i=2;i<money.length;i++) {
                int sum = 0;
                //i-2,i의 돈을 줍는 경우
                if (sum < max[i-1] + money[i]) {
                    sum = max[i-1] + money[i];
                }
                //i-2의 돈을 줍지 않고 i-1,i의 돈을 줍는 경우
                if (sum < max[i-2] + money[i-1] + money[i])
                    sum = max[i-2] + money[i-1] + money[i];
                //i의 돈을 줍지 않는 경우
                if (sum < max[i])
                    sum = max[i];
                max[i+1] = sum; //현재 주울 수 있는 최대 금액 저장
            }
            return max[max.length-1];
        }
    }
}

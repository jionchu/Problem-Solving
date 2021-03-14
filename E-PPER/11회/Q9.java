/* E-PPER 11회
 * Q9: 올바른 괄호 배열 만들기
 * created on 2021.03.14
 * created by jionchu */

public class Q9 {
	public static void main(String[] args) {
        int n = 3;
		
		int solution = new Solution().solution(n);
		System.out.println(solution);
		//5
	}
	
	public static class Solution {
		public int solution(int n) {
            //여는 괄호가 모두 나열되어 있고
            //그 사이에 닫는 괄호를 넣는 방법
            //닫는 괄호가 들어갈 수 있는 위치는 n개이다.
            //여는 괄호보다 닫는 괄호가 많으면 안되므로
            //가장 왼쪽 위치부터 차례대로 닫는 괄호를 넣는다.
            return set(0, 1, n);
        }

        private int set(int current, int max, int n) {
            if (max == n) //닫는 괄호를 넣을 수 있는 마지막 위치인 경우
                return 1; //남은 괄호를 모두 넣어야 하므로 경우의 수는 1
            else {
                int count = 0; //0개부터 max개까지 넣을 수 있는 경우의 수를 구한다.
                for (int i=0;i<=max-current;i++) {
                    count += set(current+i,max+1,n);
                }
                return count;
            }
        }
    }
}

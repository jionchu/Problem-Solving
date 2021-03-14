/* E-PPER 11회
 * Q7: 단순 계산기
 * created on 2021.03.14
 * created by jionchu */

import java.util.Arrays;

public class Q7 {
	public static void main(String[] args) {
        int n = 3;
		int[] numbers = {1, 3, 5};
		
		float solution = new Solution().solution(n, numbers);
		System.out.printf("%6f",solution);
		//4.000000
	}
	
	public static class Solution {
		public float solution(int n, int[] numbers) {
            Arrays.sort(numbers); //오름차순 정렬

            //가장 작은 수들부터 평균을 구하면
            //가장 큰 평균을 구할 수 있다.
            float avg = numbers[0];
            for (int i=1;i<n;i++) {
                avg = (avg + numbers[i])/2;
            }
            return avg;
        }
    }
}

/* E-PPER 13회
 * Q7: 회문 배열
 * created on 2020.10.10
 * created by jionchu */

public class Q7 {

	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2};
		
		int solution = new Solution().solution(arr);
		System.out.println(solution);
		//2
	}
	
	public static class Solution {
		public int solution(int[] arr) {
			int answer = 0;
			
			int a=0,b=arr.length-1;
			while(a<b) {
				if (arr[a] != arr[b]) {
                    //회문이 아닌 배열
                    //인접한 요소끼리 합한다.
					if (arr[a]>arr[b]) {
						arr[b-1] = arr[b-1]+arr[b];
						arr[b] = -1;
						b--;
					} else {
						arr[a+1] = arr[a+1]+arr[a];
						arr[a] = -1;
						a++;
					}
					answer++;
				} else {
                    //회문 조건 만족하는 경우
                    //다음 인덱스 값 비교
					a++;
					b--;
				}
			}
			
			return answer;
		}
	}
}

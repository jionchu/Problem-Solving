public class Question3 {

	public static void main(String[] args) {
        int[] arr = {0,1,1,0};
        int solution = new Solution().solution(arr);
        System.out.println(solution);
    }

	static class Solution {
        public int solution(int[] A) {
        	int min=A.length;
        	for(int i=0;i<2;i++) { // 시작이 0일 때와 1일 때 동전 뒤집는 횟수 계산
	        	int num=0;
        		for(int j=0;j<A.length;j++) {
	        		if(A[j]!=(i+j)%2) num++; // 동전 뒤집기
	        	}
	        	if(min>num) min=num;
        	}
            return min;
        }
    }
}

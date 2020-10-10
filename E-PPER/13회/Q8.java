import java.util.Stack;

/* E-PPER 13회
 * Q8: 후위표기법
 * created on 2020.10.10
 * created by jionchu */

public class Q8 {
	public static void main(String[] args) {
		char[] arr = {'2','3','+','2','*','2','/'};
		
		int solution = new Solution().solution(arr);
		System.out.println(solution);
		//5
	}
	
	public static class Solution {
		public int solution(char[] arr) {
			Stack<Integer> stack = new Stack<>();
			for (int i=0;i<arr.length;i++) { //피연산자인 경우
				if (arr[i] >= '0' && arr[i] <= '9') {
					stack.push(Integer.parseInt(String.valueOf(arr[i])));
				} else { //연산자인 경우
					int b = stack.pop();
					int a = stack.pop();
					switch (arr[i]) {
						case '+':
							stack.push(a+b);
							break;
						case '-':
							stack.push(a-b);
							break;
						case '*':
							stack.push(a*b);
							break;
						case '/':
							stack.push(a/b);
							break;
					}
				}
			}
			
			return stack.pop();
		}
	}
}

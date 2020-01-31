import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
    /*
    SW Expert Academy
    9015. 배열의 분할
    */
    
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for (int test_case = 1;test_case <= T;test_case++) {
			int N = sc.nextInt();
			int count = 1;
			
			int check = 0; // 증가: 1, 유지: 0, 감소: -1
			int num1 = sc.nextInt();
			int num2;
			
			for (int i = 0;i < N-1;i++) {
				num2 = sc.nextInt();
				if(check == 0) {
					if(num1<num2) {
						check = 1;
					} else if(num1>num2) {
						check = -1;
					}
				} if (check == 1) {
					if(num1>num2) {
						check = 0;
						count++; // 새로운 배열 생성
					}		
				} if (check == -1) {
					if(num1<num2) {
						check = 0;
						count++; // 새로운 배열 생성
					}
				}
				num1 = num2;
			}
			
			System.out.println("#"+test_case+" "+count);
		}
		
	}
}

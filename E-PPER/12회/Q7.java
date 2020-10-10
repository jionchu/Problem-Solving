import java.util.Scanner;

/* E-PPER 12회
 * Q7: 합이 100이 되는 숫자
 * created on 2020.10.10
 * created by jionchu */

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] numbers = new int[9];
        
        //총합 계산
		for (int i=0;i<9;i++) {
			int num = sc.nextInt();
			numbers[i] = num;
			sum += num;
		}
		
		Loop:
		for (int i=0;i<9;i++) {
			for (int j=i+1;j<9;j++) {
                //총합에서 두 수를 뺀 값이 100이면 break
				if (sum-numbers[i]-numbers[j] == 100) {
					numbers[i] = -1;
					numbers[j] = -1;
					break Loop;
				}
			}
		}
        
        //결과 배열 출력
		for (int i=0;i<9;i++) {
			if (numbers[i] != -1) {
				System.out.print(numbers[i]+" ");
			}
		}
		
		sc.close();
	}
}
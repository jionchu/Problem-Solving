import java.util.Scanner;
import java.util.Arrays;

/* E-PPER 14회
 * Q3: 재배열 가능한 문자열
 * created on 2020.10.09
 * created by jionchu */

public class Q2019_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next().toLowerCase(); // 첫번째 문자열
		String str2 = sc.next().toLowerCase(); // 두번째 문자열
		
		String result = "T";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2))
			result = "T";
		else
			result = "F";

		sc.close();
		System.out.println(result);
	}
}
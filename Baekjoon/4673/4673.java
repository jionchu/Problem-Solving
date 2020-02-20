/* Baekjoon Online Judge
 * 4673: 셀프 넘버
 * created on 202.02.20
 * created by jionchu */

public class Main {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10000]; // 생성자가 있는지 확인하는 배열
		
		for(int j=1;j<=10000;j++) {
			int n=d(j);
			if(n<=10000)
				check[n-1]=true; // 생성자가 있음을 표시
		}
		
		StringBuilder buf = new StringBuilder();
		for(int i=0;i<10000;i++) {
			if(!check[i]) // 생성자가 없으면 = 셀프 넘버이면
				buf.append(i+1).append("\n");
		}
		System.out.println(buf.toString());
	}
	
	static int d(int n) { // n과 n의 각 자리수를 더하는 함수
		int sum = n;
		while(n!=0) { // 각 자리수 더하기
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
}

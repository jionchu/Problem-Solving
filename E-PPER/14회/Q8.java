import java.util.Scanner;

/* E-PPER 14회
 * Q8: 토마토 창고
 * created on 2020.10.10
 * created by jionchu */

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr_cur = new int[n+2][m+2];
		int[][] arr_next = new int[n+2][m+2];
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				arr_cur[j+1][i+1] = sc.nextInt();
			}
		}
		
		//테두리 -1로 감싸기
		for (int i=0;i<n+2;i++) {
			arr_cur[i][0] = -1;
			arr_cur[i][m+1] = -1;
		}
		for (int i=0;i<m;i++) {
			arr_cur[0][i+1] = -1;
			arr_cur[n+1][i+1] = -1;
		}
		
		//arr_next 초기화
		for (int i=0;i<m+2;i++) {
			for (int j=0;j<n+2;j++) {
				arr_next[j][i] = arr_cur[j][i];
			}
		}
		
		int flag = 1;
		int answer = 0;
		while (flag == 1) { //그날 익은 토마토가 있으면 반복
			flag = 0;
			for (int i=1;i<m+1;i++) {
				for (int j=1;j<n+1;j++) { //토마토가 비어있지 않고 이미 익은 토마토가 아닌 경우
					if (arr_cur[j][i]==0&&(arr_cur[j][i+1]==1||
							arr_cur[j][i-1]==1||arr_cur[j+1][i]==1||arr_cur[j-1][i]==1)) {
						flag = 1;
						arr_next[j][i] = 1;
					}
				}
			}
			
			if (flag == 1) {
				answer++;
				for (int i=0;i<m+2;i++) {
					for (int j=0;j<n+2;j++) {
						arr_cur[j][i] = arr_next[j][i];
					}
				}
			}
		}
		
		//안익은 토마토가 있는지 확인
		for (int i=1;i<m+1;i++) {
			for (int j=1;j<n+1;j++) {
				if (arr_cur[j][i] == 0) {
					answer = -1;
				}
			}
		}
		
		sc.close();
		System.out.println(answer);
	}
}
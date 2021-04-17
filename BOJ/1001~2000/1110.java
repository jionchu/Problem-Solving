import java.io.*;

/* Baekjoon Online Judge
 * 1110: 더하기 사이클
 * created at 2020.02.08
 * created by jionchu */

public class Main {

  public static void main(String[] args) throws IOException {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine().trim());
		
    int cycle = 0;
    int new_number = N;
		
    while (true) {
      int sum = (new_number/10)+(new_number%10);
      new_number = (new_number%10)*10+(sum%10); // 새로운 수
      cycle++;
      if(new_number==N) // 원래 수로 돌아온 경우 사이클 종료
        break;
    }
		
    System.out.println(cycle);
		
  }
	
}

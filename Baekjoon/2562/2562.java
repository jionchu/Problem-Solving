import java.io.*;

/* Baekjoon Online Judge
 * 2562: 최댓값
 * created at 2020.02.09
 * created by jionchu */

public class Main {
  public static void main(String[] args) throws IOException {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0;
    int index = 0;
		
    for (int i=1;i<=9;i++) {
      int n = Integer.parseInt(br.readLine().trim());
      if (max<n) {
        max = n;
        index = i;
      }
    }
		
    System.out.println(max+"\n"+index);
		
  }
}

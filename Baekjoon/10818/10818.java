import java.io.*;

/* Baekjoon Online Judge
 * 10818: 최소, 최대
 * created at 2020.02.09
 * created by jionchu */

public class Main {

  public static void main(String[] args) throws IOException {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
		
    String line[] = br.readLine().split(" ");
    int min=Integer.parseInt(line[0]);
    int max=min;
    for (int i=1;i<N;i++) {
      int num = Integer.parseInt(line[i]);
      if(num<min) min = num;
      if(num>max) max = num;
    }
		
    System.out.print(min+" "+max);
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 1546: 평균
 * created on 2020.02.16
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		float[] scores = new float[N];
		float max = 0;
		for (int i = 0;i < N;i++) {
			scores[i] = Float.parseFloat(line[i]);
			if (scores[i] > max) max = scores[i];
		}
		
		float sum = 0;
		for (int i = 0;i < scores.length;i++) {
			sum += scores[i]/max*100;
		}
		
		System.out.println(sum/N);
		
	}
}

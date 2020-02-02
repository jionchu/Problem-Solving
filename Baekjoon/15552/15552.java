import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<n;i++) {
			String[] line = br.readLine().split(" ");
			int num1 = Integer.parseInt(line[0]);
			int num2 = Integer.parseInt(line[1]);
			bw.write((num1+num2)+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}

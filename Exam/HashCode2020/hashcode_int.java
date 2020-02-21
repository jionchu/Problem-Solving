import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/* Hash Code 2020
 * created on 2020.02.21
 * created by jionchu */

// 처음부터 순서대로 scan한 경우
public class hashcode_int {

	public static void main(String[] args) throws IOException {
		String fileName="b_read_on.txt";
		BufferedReader br = null;
		
		// read file
		try {
			br = new BufferedReader(new FileReader(fileName));
		}catch(FileNotFoundException e) {
			System.out.println("Error in opening a file.\n");
			System.exit(0);
		}
		
		// first line
		String[] first=br.readLine().split(" ");
		int booksNum = Integer.parseInt(first[0]);
		int librariesNum = Integer.parseInt(first[1]);
		int days = Integer.parseInt(first[2]);

		// second line
		String[] second = br.readLine().split(" ");
		int[] scores = new int[second.length];
		for (int i=0;i<second.length;i++) {
			scores[i] = Integer.parseInt(second[i]);
		}
		
		Library_int[] libraries = new Library_int[librariesNum];
		for (int i=0;i<librariesNum;i++) {
			String[] info = br.readLine().split(" ");
			libraries[i] = new Library_int( // library의 정보 저장
					Integer.parseInt(info[0]),Integer.parseInt(info[1]),Integer.parseInt(info[2]));
			String[] booksInLibrary = br.readLine().split(" ");
			for (int j=0;j<booksInLibrary.length;j++) { // library에 있는 책들 저장
				int book = Integer.parseInt(booksInLibrary[j]);
				libraries[i].books[j]=book;
			}
		}
		
		int result = 0;
		int rest = days;
		
		int count = 0; // 총 몇개의 library들이 signup 하는지 세기
		for (int i=0;i<libraries.length;i++) {
			rest -= libraries[i].sign;
			if(rest<0) break; // deadline 안에 signup 실패
			count++;
		}
		
		fileName="b_result.txt"; // output file
		PrintWriter outStream=null;
		try {
			outStream=new PrintWriter(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("Exception Occurs");
			System.exit(0);
		}
		rest = days;
		outStream.println(count);
		for (int i=0;i<libraries.length;i++) {
			rest -= libraries[i].sign;
			if(rest<0) break; // deadline 안에 signup 실패
			int maxBook = rest*libraries[i].ship; // 남은 기간동안 scan 할 수 있는 책의 최대 개수
			int scannedBook; // 현재 library가 scan 한 책의 개수
			if(maxBook<=libraries[i].booksNum) scannedBook = maxBook;
			else scannedBook = libraries[i].booksNum;
			outStream.println(i+" "+scannedBook);
			
			for (int j=0;j<scannedBook;j++) { // library 마다 scan한 책의 리스트 출력
				outStream.print(libraries[i].books[j]+" ");
			}
			outStream.println();
		}
		outStream.close();
	}
	
}

class Library_int { // library 정보를 담을 class
	
	int booksNum, sign, ship;
	int[] books;
	
	Library_int(){}
	Library_int(int booksNum, int sign, int ship){
		this.booksNum = booksNum;
		this.sign = sign;
		this.ship = ship;
		books = new int[booksNum];
	}
	
}

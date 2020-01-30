import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        int c=keyboard.nextInt();
        int result = a;
        if(a==b)
        	result = a;
        else if(a>b && a>c && b>=c)
        	result = b;
        else if(a>b && a>c && b<=c)
        	result = c;
        else if(a>b && a<=c)
        	result = a;
        else if(a<b && b<=c)
        	result = b;
        else if(a<b && b>c && c>=a)
        	result = c;
        else if(a<b && b>c && c<a)
        	result = a;
        
        System.out.println(result);
	}
}

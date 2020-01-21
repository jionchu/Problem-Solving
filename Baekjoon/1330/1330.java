import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        if(a < b)
            System.out.println("<");
        else if(a == b)
            System.out.println("==");
        else
            System.out.println(">");
    }
}

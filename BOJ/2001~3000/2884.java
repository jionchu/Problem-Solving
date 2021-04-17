import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int H = keyboard.nextInt();
        int M = keyboard.nextInt();
        if(M<45) {
            H = (H+24-1)%24;
            M += 60;
        }
        System.out.println(H+" "+(M-45));
    }
}

import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int sum,num;
        int T=keyboard.nextInt();
        for(int i=0;i<T;i++) {
            sum=0;
            for(int j=0;j<10;j++) {
                num=keyboard.nextInt();
                if(num%2!=0)
                    sum+=num;
            }
            System.out.println("#"+(i+1)+" "+sum);
        }
    }
}

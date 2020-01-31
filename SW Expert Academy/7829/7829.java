import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P,divisor=0,min,max;
        long N=0;
        int T=sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            min=1000000;max=0;
            P=sc.nextInt();
            
            for(int j=0;j<P;j++) {
                divisor=sc.nextInt();
                if(divisor<min)
                    min=divisor;
                if(divisor>max)
                    max=divisor;
            }
            N=max*min;
            System.out.println("#"+test_case+" "+N);
        }
    }
}

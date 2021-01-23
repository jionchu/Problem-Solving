/* Programmers
 * 연습문제 - 직사각형 별찍기
 * created on 2021.01.23
 * created by jionchu */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0;i<b;i++) {
            for (int j=0;j<a;j++){ //한 행 별 찍기
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}
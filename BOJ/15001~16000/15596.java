/* Baekjoon Online Judge
 * 15596: 정수 N개의 합
 * created on 2020.02.17
 * created by jionchu */

public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i=0;i<a.length;i++)
            ans+=a[i];
        return ans;
    }
}

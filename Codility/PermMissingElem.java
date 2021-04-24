/* Codility
 * Lesson 3 - PermMissingElem
 * created on 2021.04.24
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A); //오름차순 정렬

        for (int i=0;i<A.length;i++) {
            //앞의 순서에 빠진 번호가 없다면
            //i번째 수는 i+1이 되어야 함
            //아니면 i+1이 빠져있는 것
            if (A[i] != i+1) return i+1;
        }
        
        //배열에서 빠진 수를 찾지 못한 경우
        //1부터 N까지 모두 존재하며 N+1이 빠진 경우
        return A.length+1;
    }
}
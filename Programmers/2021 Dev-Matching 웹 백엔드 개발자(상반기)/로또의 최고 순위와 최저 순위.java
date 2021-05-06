/* Programmers
 * 2021 Dev-Matching: 웹 백엔드 개발자(상반기) - 로또의 최고 순위와 최저 순위
 * created on 2021.05.06
 * created by jionchu */

import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeros = 0; //알아볼 수 없는 번호 개수
        //구매한 로또 번호 저장
        HashSet<Integer> set = new HashSet<>();
        for (int num: lottos) {
            if (num == 0) zeros++;
            else set.add(num);
        }
        
        int count = 0; //일치하는 번호 개수
        for (int num: win_nums) {
            //일치하는 번호 개수 세기
            if (set.contains(num)) count++;
        }
        
        int min = 7-count-zeros;
        if (min == 7) min = 6;
        int max = 7-count;
        if (max == 7) max = 6;
        return new int[]{min, max};
    }
}
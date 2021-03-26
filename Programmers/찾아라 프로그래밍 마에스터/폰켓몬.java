/* Programmers
 * 찾아라 프로그래밍 마에스터 - 폰켓몬
 * created on 2021.03.26
 * created by jionchu */

import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2; //가져갈 수 있는 최대 폰켓몬 수
        
        //중복 없이 몇 가지 종류의 폰켓몬이 있는지 저장
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            hashSet.add(nums[i]);
        }
        
        //모든 종류의 폰켓몬을 가져갈 수 있으면 hashSet의 size를 return
        //모든 종류의 폰켓몬을 가져갈 수 없는 경우 max를 return
        return hashSet.size() > max ? max : hashSet.size();
    }
}
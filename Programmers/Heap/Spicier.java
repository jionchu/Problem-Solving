/* Programmers
 * 힙(Heap) - 더 맵게
 * created on 2021.01.16
 * created by jionchu */

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //모든 음식의 스코빌 지수를 min heap에 저장
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int food : scoville) {
            heap.add(food);
        }
        
        //스코빌 지수가 K 미만인 음식이 있는 경우
        while(heap.peek() < K) {
            //새로운 음식 만들기
            heap.add(heap.poll() + heap.poll()*2);
            answer++;
            
            //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
            if (heap.size() == 1 && heap.peek() < K) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
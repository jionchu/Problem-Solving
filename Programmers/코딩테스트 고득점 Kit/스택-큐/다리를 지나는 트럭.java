/* Programmers
 * 스택/큐 - 다리를 지나는 트럭
 * created on 2021.01.15
 * created by jionchu */

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length; //마지막 트럭이 이동하는 시간
        int current_weight = 0;
        
        Queue<Integer> passing = new LinkedList<>();
        Queue<Integer> waiting = new LinkedList<>();
        for (int truck_weight : truck_weights) {
            waiting.add(truck_weight);
        }
        
        while(waiting.size() > 0) {
            //다음 트럭의 무게도 견딜 수 있는 경우
            if (current_weight + waiting.peek() <= weight) {
                passing.add(waiting.peek());
                current_weight += waiting.poll();
            } else {//다음 트럭의 무게를 견딜 수 없는 경우
                passing.add(0);
            }
            
            //트럭이 다리를 건넌 경우
            if (passing.size() == bridge_length) {
                current_weight -= passing.poll();
            }
            answer++;
        }
        
        return answer;
    }
}
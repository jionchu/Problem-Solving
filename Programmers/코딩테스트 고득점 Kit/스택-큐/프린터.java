/* Programmers
 * 스택/큐 - 프린터
 * created on 2021.04.18
 * created by jionchu */

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Printer> q = new LinkedList<>();
        
        //모든 인쇄 요청을 큐에 삽입
        for (int i = 0; i < priorities.length; i++) {
			q.offer(new Printer(i, priorities[i]));
		}
        
        //모든 문서를 인쇄할 때까지 반복
        while (!q.isEmpty()) {

			boolean flag = false;
			int com = q.peek().prior; //대기목록 가장 앞에 있는 문서의 중요도
			
			//대기목록에 중요도가 더 높은 문서가 있는지 확인
            for (Printer p : q) {
                if (com < p.prior) {
					flag = true;
				}
			}

            //대기목록에 중요도가 더 높은 문서가 있는 경우
			if (flag) {
				q.offer(q.poll()); //대기목록 맨 뒤로 넣기
			}
            //현재 문서가 중요도가 가장 높은 경우
            else {
                //내가 요청한 문서가 인쇄되는 경우
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
                    return answer;
				}
			}
		}
        
        return answer;
    }
    
    //인쇄 요청 정보
    class Printer {
		int location; //대기 목록 순서
		int prior; //중요도

		Printer(int location, int prior) {
			this.location = location;
			this.prior = prior;
		}
	}
}
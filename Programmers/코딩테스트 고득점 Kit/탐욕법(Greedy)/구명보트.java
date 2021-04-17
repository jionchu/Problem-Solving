/* Programmers
 * 탐욕법(Greedy) - 구명보트
 * created on 2021.02.01
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //오름차순 정렬
        Arrays.sort(people);
        int start = 0, end = people.length-1;
        while(start <= end) {
            //맨 앞 사람 몸무게와 맨 뒤 사람 몸무게가
            //제한 무게를 넘지 않는 경우 둘 다 태우고
            //제한 무게를 넘는 경우 맨 뒤(무거운) 사람만 태움
            if (people[end--] + people[start] <= limit)
                start++;
            answer++; //보트 1개 추가 사용
        }
        return answer;
    }
}
/* Programmers
 * 깊이/너비 우선 탐색(DFS/BFS) - 타겟 넘버
 * created on 2021.01.16
 * created by jionchu */

class Solution {
    
    int[] numbers;
    int answer = 0;
    int target;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        calculate(0,0,1);
        calculate(0,0,-1);
        
        return answer;
    }
    
    public void calculate(int index, int result, int type) {
        if (index == numbers.length-1) {
            //타겟 넘버를 만든 경우
            if (result+numbers[index]*type == target)
                answer++;
        } else {
            //다음 숫자를 더하기
            calculate(index+1,result+numbers[index]*type,1);
            //다음 숫자를 빼기
            calculate(index+1,result+numbers[index]*type,-1);
        }
    }
}
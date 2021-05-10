/* Programmers
 * 2020 카카오 인턴십 - 수식 최대화
 * created on 2021.05.10
 * created by jionchu */

import java.util.Stack;
class Solution {
    long max = 0;
    char[] express;
    
    public long solution(String expression) {
        express = expression.toCharArray();
        
        //가능한 모든 우선순위 경우의 수
        String[] priorities = {"+-*", "+*-", "-+*", "-*+", "*+-", "*-+"};

        //각 우선순위마다 연산 결과 확인
        for (String priority: priorities) {
            long result = getResult(priority);
            if (result > max) max = result; //최대값 구하기
        }
        
        return max;
    }
    
    //입력 우선순위에 따라 연산 결과 구하기
    public long getResult(String priority) {
        Stack<Long> numbers = new Stack<>(); //숫자들 저장
        Stack<Character> operators = new Stack<>(); //연산자들 저장
        StringBuilder sb = new StringBuilder();
        
        for (char c : express) {
            switch (c) {
                case '+': case '-': case '*': //연산자인 경우
                    numbers.push(Long.parseLong(sb.toString()));
                    sb = new StringBuilder(); //다음 숫자 인식을 위해 초기화
                    
                    //이전 연산자보다 우선순위가 낮거나 같은 경우
                    while (operators.size() > 0 && priority.indexOf(c) >= priority.indexOf(operators.peek())) {
                        //계산한 결과값을 숫자 스택에 추가
                        numbers.push(calculate(operators.pop(),numbers.pop(),numbers.pop()));
                    }
                    //이전 연산자보다 우선순위가 높은 경우 계속 진행
                    operators.push(c);
                    break;
                default: sb.append(c); break; //연산자가 아닌 경우 숫자로 붙이기
            }
        }
        
        numbers.push(Long.parseLong(sb.toString())); //마지막 숫자 추가
        while (operators.size() > 0) { //모든 연산자에 대한 연산 완료하기
            numbers.push(calculate(operators.pop(), numbers.pop(), numbers.pop()));
        }
        
        return Math.abs(numbers.pop()); //절대값 반환
    }
    
    //계산
    public long calculate(char operator, long num2, long num1) {
        switch(operator) {
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
        }
        return 0;
    }
}
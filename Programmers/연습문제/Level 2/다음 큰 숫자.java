/* Programmers
 * 연습문제 - 다음 큰 숫자
 * created on 2021.02.06
 * created by jionchu */

class Solution {
    public int solution(int n) {
        char[] num = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        int index = -1;
        for (int i=0;i<num.length;i++) {
            if (num[i] == '1') {
                if (i > 0 && num[i-1] == '0') {
                    count = 0;
                    index = i-1; //가장 하위의 1 앞에 있는 0의 위치 구하기
                }
                count++; //위치가 변할 수 있는 1의 개수 구하기
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (index == -1) {
            sb.append("1");
            count--;
        }
        
        for (int i=0;i<num.length;i++) {
            if (i == index) { //가장 하위 0을 1로 바꾼다.
                sb.append("1");
                count--;
            } else if (i > index) {
                if ((num.length-i) > count)
                    sb.append("0");
                else
                    sb.append("1");
            } else {
                sb.append(num[i]);
            }
        }
        
        //2진수 숫자를 10진수 숫자로 변환
        return Integer.parseInt(sb.toString(),2);
    }
}
/* Programmers
 * 2020 카카오 인턴십 - 키패드
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10, right = 12, left_len, right_len;
        for (int num : numbers) {
            switch(num) {
                case 1: case 4: case 7:
                    left = num;
                    answer += "L"; break;
                case 3: case 6: case 9:
                    right = num;
                    answer += "R"; break;
                case 2: case 5: case 8: case 0:
                    if (num == 0)
                        num = 11;
                    left_len = (num-1)%3-(left-1)%3+Math.abs(left/3-num/3); //왼손 엄지손가락의 거리
                    right_len = (right-1)%3-(num-1)%3+Math.abs((right-1)/3-num/3); //오른손 엄지손가락의 거리
                    if (left_len == right_len) { //두 엄지손가락의 거리가 같다면
                        if (hand.equals("left")) {//왼손잡이인 경우
                            answer += "L";
                            left = num;
                        }
                        else {//오른손잡이인 경우
                            answer += "R";
                            right = num;
                        }
                    } else if (left_len > right_len) { //오른손 엄지손가락이 더 가까운 경우
                        answer += "R";
                        right = num;
                    } else { //왼손 엄지손가락이 더 가까운 경우
                        answer += "L";
                        left = num;
                    }
                    break;
            }
        }
        return answer;
    }
}
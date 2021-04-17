/* Programmers
 * 연습문제 - 2016년
 * created on 2021.01.18
 * created by jionchu */

class Solution {
    public String solution(int a, int b) {
        int days = b;
        
        //일수 계산
        for (int i=0;i<a;i++) {
            switch(i) {
                case 0: break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: days += 31; break;
                case 2: days += 29; break;
                case 4: case 6: case 9: case 11: days += 30; break;
            }
        }
        
        //요일 계산
        switch (days%7) {
            case 0: return "THU";
            case 1: return "FRI";
            case 2: return "SAT";
            case 3: return "SUN";
            case 4: return "MON";
            case 5: return "TUE";
            case 6: return "WED";
            default: return "FRI";
        }
    }
}
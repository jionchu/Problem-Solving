/* Programmers
 * 위클리 챌린지 - 2주차 - 상호 평가
 * created on 2021.08.10
 * created by jionchu */

class Solution {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        
        for (int i=0;i<scores.length;i++) {
            
            int sum = 0;
            int mine = scores[i][i];
            int min = 101;
            int max = -1;
            
            // 본인 점수 제외한 전체 합 구하기
            for (int j=0;j<scores[i].length;j++) {
                if (i == j) continue;
                
                int score = scores[j][i];
                sum += score;

                // 최저점인 경우 업데이트
                if (score < min) {
                    min = score;
                }
                // 최고점인 경우 업데이트
                if (score > max) {
                    max = score;
                }
            }
            
            // 자신이 평가한 점수가 유일한 최저점이거나 유일한 최고점인경우
            if (mine < min || mine > max) {
                answer.append(getGrade(sum/(scores.length-1)));
            }
            // 아닌 경우 자신이 평가한 점수 더해서 평균 구하기
            else {
                sum += mine;
                answer.append(getGrade(sum/scores.length));
            }
        }
        
        return answer.toString();
    }
    
    // 점수에 따라 학점을 부여하는 함수
    public char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 50) return 'D';
        else return 'F';
    }
}
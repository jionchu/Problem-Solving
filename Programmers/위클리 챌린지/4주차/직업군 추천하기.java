/* Programmers
 * 위클리 챌린지 - 4주차 - 직업군 추천하기
 * created on 2021.08.26
 * created by jionchu */

import java.util.ArrayList;

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        
        // 직업군 리스트
        String[] job = new String[table.length];
        // 직업군 언어 점수
        ArrayList<ArrayList<String>> scores = new ArrayList<>();
        
        for (int i=0;i<table.length;i++) {
            String[] langs = table[i].split(" ");
            job[i] = langs[0];
            
            ArrayList<String> lang = new ArrayList<>();
            for (int j=1;j<=5;j++) {
                lang.add(langs[j]);
            }

            scores.add(lang);
        }
        
        String answer = "";
        int score;
        int max = 0;

        // 직업군별
        for (int i=0;i<5;i++) {
            score = 0;

            // 언어 선호도별
            for (int j=0;j<languages.length;j++) {
                if (scores.get(i).contains(languages[j])) {
                    score += (5-scores.get(i).indexOf(languages[j]))*preference[j];
                }
            }

            if (score > max) {
                answer = job[i];
                max = score;
            } else if (score == max && answer.compareTo(job[i]) > 0) {
                answer = job[i];
            }
        }
        
        return answer;
    }
}
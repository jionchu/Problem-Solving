/* E-PPER 14회
 * Q5: 단어 게임
 * created on 2021.03.15
 * created by jionchu */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Q5 {
    public static void main(String[] args) {
        String[] words = {"zagreb","split","zadar","sisak"};
        String[] game = {"z","s","s","z","z"};

        String[] solution = new Solution().solution(words,game);
        for (int i=0;i<solution.length;i++) {
            System.out.println(solution[i]);
        }
        //zadar
        //sisak
        //split
        //zagreb
        //zadar
    }

    public static class Solution {
        public String[] solution(String[] words, String[] game) {
            ArrayList<String> answer = new ArrayList<>();
            Arrays.sort(words); //알파벳 순으로 정렬
            int[] count = new int[words.length]; //단어가 사용된 횟수

            //각 알파벳으로 시작하는 단어의 index 저장
            HashMap<String, Integer> index = new HashMap<>();
            for (int i=0;i<words.length;i++) {
                String first = String.valueOf(words[i].charAt(0));
                //해당 알파벳으로 시작하는 index가 이미 있는 경우
                if (index.containsKey(first)) {
                    continue;
                } else {
                    index.put(first, i);
                }
            }

            for (String letter : game) {
                //해당 알파벳으로 시작하는 단어가 있는 경우
                if (index.containsKey(letter)) {
                    int locate = index.get(letter); //해당 알파벳으로 시작하는 첫 단어
                    int min = count[locate]; //해당 단어가 사용된 횟수
                    for (int i = index.get(letter)+1;i<words.length;i++) {
                        if (!words[i].substring(0, 1).equals(letter)) {
                            break; //해당 알파벳으로 시작하는 단어가 아닌 경우 중지
                        } else if (count[i] < min) { //사용 횟수가 최소인 단어
                            min = count[i];
                            locate = i;
                        }
                    }
                    count[locate]++; //사용 횟수 증가
                    answer.add(words[locate]); //사용 기록에 추가
                }
            }

            return answer.toArray(new String[answer.size()]);
        }
    }
}

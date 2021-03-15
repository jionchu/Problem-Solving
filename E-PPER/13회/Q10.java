/* E-PPER 13회
 * Q10: 접두어 트리 노드
 * created on 2021.03.15
 * created by jionchu */

import java.util.Arrays;
import java.util.ArrayList;
public class Q10 {
    public static void main(String[] args) {
        String[] prefix = {"baab","abab","aabb","bbaa"};

        int solution = new Solution().solution(prefix);
        System.out.println(solution);
        //5
    }

    public static class Solution {
        public int solution(String[] prefix) {
            ArrayList<String> node = new ArrayList<>();
            for (String p : prefix) { //각 접두어에 대해
                char[] alphabets = p.toCharArray();
                Arrays.sort(alphabets); //알파벳순으로 정렬
                p = String.valueOf(alphabets);
                while (!p.isEmpty()) {
                    if (node.contains(p)) { //접두어에 대한 노드가 있는 경우
                        break; //중지
                    } else { //접두어에 대한 노드가 없는 경우
                        node.add(p); //노드 추가
                        p = p.substring(0, p.length()-1); //부모 노드가 존재하는지 확인
                    }
                }
            }
            return node.size() + 1; //비어있는 root 노드 1개 추가
        }
    }
}

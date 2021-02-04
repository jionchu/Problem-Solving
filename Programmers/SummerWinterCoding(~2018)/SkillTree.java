/* Programmers
 * Summer/Winter Coding(~2018) - 스킬트리
 * created on 2021.02.04
 * created by jionchu */

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            StringBuilder sb = new StringBuilder(skill);
            boolean flag = true;
            for (String s : skill_tree.split("")) {
                //배울 수 있는 스킬인 경우
                if (sb.length()>0 && s.equals(sb.substring(0, 1))) {
                    sb.deleteCharAt(0); //선행 스킬 순서에서 삭제
                } else if (sb.indexOf(s)>-1) { //아직 배우지 못한 스킬인 경우
                    flag = false;
                    break;
                }
            }
            if (flag) //가능한 스킬트리인 경우
                answer++;
        }
        return answer;
    }
}
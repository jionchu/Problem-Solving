/* Programmers
 * 깊이/너비 우선 탐색(DFS/BFS) - 단어 변환
 * created on 2021.02.08
 * created by jionchu */

 class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] check = new boolean[words.length];
        int answer = dfs(begin, target, check, words);
        //단어 배열 크기보다 큰 경우는 변환하지 못한 경우이므로 0 return
        return answer > words.length ? 0 : answer;
    }
    
    public int dfs(String begin, String target, boolean[] check, String[] words) {
        int min = words.length;
        for (int i=0;i<words.length;i++) {
            if (!check[i]) { //변환 단계를 거치지 않은 단어
                int differ = 0;
                for (int j=0;j<begin.length();j++) { //몇 글자가 다른지 확인
                    if (begin.charAt(j) != words[i].charAt(j))
                        differ++;
                }
                if (differ == 1) { //변환 가능한 단어
                    if (words[i].equals(target)) //target으로 변환한 경우
                        return 1;
                    
                    //target이 아닌 경우
                    check[i] = true;
                    int count = dfs(words[i], target, check, words);
                    if (min > count) //최소 횟수 구하기
                        min = count;
                }
            }
        }
        return min+1;
    }
}
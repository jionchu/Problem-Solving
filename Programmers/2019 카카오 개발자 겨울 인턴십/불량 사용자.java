/* Programmers
 * 2019 카카오 개발자 겨울 인턴십 - 불량 사용자
 * created on 2021.03.29
 * created by jionchu */

import java.util.HashSet;
class Solution {
    private String[] user_id;
    private String[] banned_id;
    private HashSet<Integer> hashSet;
    
    public int solution(String[] user_id, String[] banned_id) {
        this.user_id = user_id;
        this.banned_id = banned_id;
        hashSet = new HashSet<>();
        
        int visit = 0;
        check(visit,0);
        
        return hashSet.size();
    }
    
    public void check(int visit, int index) {
        if (index >= banned_id.length) { //제재 아이디 리스트가 생성된 경우
            hashSet.add(visit); //hashSet에 리스트 추가
        } else {
            String format = banned_id[index].replaceAll("\\*","[a-z0-9]");        
            //불량 사용자에 매핑되는 제재 아이디 찾기
            for (int i=0;i<user_id.length;i++) {
                //아직 매핑되지 않는 아이디에 대해 불량 사용자인지 확인
                if (((visit>>i) & 1) == 0 && user_id[i].matches(format)) {
                    //불량 사용자면
                    check((visit|1<<i),index+1);
                }
            }
        }
    }
}
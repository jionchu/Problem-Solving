import java.util.HashMap;

/* Programmers
 * 해시 - 완주하지 못한 선수
 * created on 2020.08.26
 * created by jionchu */

class Solution {
    public String solution(String[] participant, String[] completion) {
	    HashMap<String, Integer> hm = new HashMap<>();
	    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	    
	    for (String player : completion) {
	        int count = hm.get(player);
	        if (count == 1)
	            hm.remove(player);
	        else
	            hm.put(player, count - 1);
	    }
		
	    return hm.keySet().iterator().next();
    }
}

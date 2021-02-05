/* Programmers
 * 2020 KAKAO BLIND RECRUITMENT - 문자열 압축
 * created on 2020.09.05
 * created by jionchu */

class Solution {
	public int solution(String s) {
		
		// 압축되지 않은 문자열의 길이
		int answer = s.length();
		
		for (int i=1;i<=s.length();i++) {
			
			// i개 단위로 잘라 압축
			int len = 0;
			for (int j=1;j<=s.length()/i;j++) {
				String part = s.substring((j-1)*i,j*i);
				
				len += i;
				int count = 1;
	      
				// 다음 substring이 동일한 경우 길이 update
				if (j+1<=s.length()/i && s.substring(j*i,(j+1)*i).equals(part)) {
					j++;
					count++;

				while(j+1<=s.length()/i) {
					// 다음 substring도 동일한 경우 j update
					if (s.substring(j*i,(j+1)*i).equals(part)) {
						j++;
						count++;
					} else { // 다른 경우 중단
						break;
					}
				}
				// 반복 표시 길이 추가
				len += Math.log10(count)+1;
			}
		}
		
		// i개 단위로 자르고 마지막에 남은 문자열 길이 추가
		len += s.length()%i;
		
		// 압축했을 때의 길이가 answer보다 작은 경우 answer update
		if (len < answer)
			answer = len;
		}
		
		return answer;
	}
}

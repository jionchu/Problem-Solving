/* Programmers
 * 연습문제 - 가운데 글자 가져오기
 * created on 2021.06.18
 * created by jionchu */

class Solution {
    fun solution(s: String): String {
        var center: Int = s.length/2
        
        //단어의 길이가 짝수인 경우
        if (s.length % 2 == 0) {
            return s.substring(center-1, center+1)
        }
        //단어의 길이가 홀수인 경우
        else {
            return s.substring(center, center+1)
        }
    }
}
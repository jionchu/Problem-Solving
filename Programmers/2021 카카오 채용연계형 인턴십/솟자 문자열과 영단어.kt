/* Programmers
 * 2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어
 * created on 2021.07.22
 * created by jionchu */

class Solution {
    fun solution(s: String): Int {
        val list = listOf("zero","one","two","three","four","five","six","seven","eight","nine")
        var answer = s
        
        for (i in 0..9) {
            answer = answer.replace(list[i], i.toString())
        }
        
        return answer.toInt()
    }
}
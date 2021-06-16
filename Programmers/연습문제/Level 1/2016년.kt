/* Programmers
 * 연습문제 - 2016년
 * created on 2021.06.16
 * created by jionchu */

class Solution {
    fun solution(a: Int, b: Int): String {
        
        //요일 배열
        val dayOfWeek = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        //월별 일수 배열
        val daysOfMonth = arrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
        
        //1월 1일부터 a월 b일까지의 일수
        //1월 1일이 금요일(dayOfWeek[4])이므로 +4
        var days = 4 + b
        
        //월별 일수 더하기
        for (i in 2..a) {
            days += daysOfMonth[i-2]
        }
        
        //해당 날의 요일 return
        return dayOfWeek[days%7]
    }
}
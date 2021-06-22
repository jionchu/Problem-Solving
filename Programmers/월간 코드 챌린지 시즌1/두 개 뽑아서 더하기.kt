/* Programmers
 * 월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기
 * created on 2021.06.22
 * created by jionchu */

class Solution {
    fun solution(numbers: IntArray): IntArray {
        //동적 배열 선언
        var answer = mutableListOf<Int>()
        
        //두 수 뽑아 더하기
        for (i in 0..numbers.size-2) {
            for (j in i+1..numbers.size-1) {
                //중복이 없는 경우 배열에 추가
                if (!answer.contains(numbers[i]+numbers[j]))
                    answer.add(numbers[i]+numbers[j])
            }
        }

        //배열 중복 제거
        return answer.sorted().toIntArray()
    }
}
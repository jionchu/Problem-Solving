/* Programmers
 * 완전탐색 - 모의고사
 * created on 2021.07.04
 * created by jionchu */

class Solution {
    fun solution(answers: IntArray): IntArray {
        
        // 수포자들이 찍는 방식
        val check_first = intArrayOf(1,2,3,4,5)
        val check_second = intArrayOf(2,1,2,3,2,4,2,5)
        val check_third = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        // 수포자들의 점수 배열
        val score = mutableListOf(0,0,0)

        // 정답을 맞춘 사람의 점수 증가
        for (i in 0 until answers.size) {
            if (answers[i] == check_first[i%check_first.size]) score[0]++
            if (answers[i] == check_second[i%check_second.size]) score[1]++
            if (answers[i] == check_third[i%check_third.size]) score[2]++
        }

        // 가장 높은 점수 구하기
        val max = score.max()

        // 가장 많이 맞춘 수포자들 리스트에 추가
        val answer = ArrayList<Int>()
        for (i in 0 until 3) {
            if (score[i] == max) answer.add(i+1)
        }

        return answer.toIntArray()
    }
}
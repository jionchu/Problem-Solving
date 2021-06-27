/* Programmers
 * 정렬 - K번째수
 * created on 2021.06.27
 * created by jionchu */

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size,{0})
        
        for (i in commands.indices) {
            //배열 자른 후 정렬
            var sliced = array.sliceArray(commands[i][0]-1..commands[i][1]-1).sorted()
            //n번째 숫자 저장
            answer[i] = sliced[commands[i][2]-1]
        }
        
        return answer
    }
}
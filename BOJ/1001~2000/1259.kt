/* Baekjoon Online Judge
 * 1259: 팰린드롬수
 * created on 2021.07.01
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = br.readLine()

        // 0을 입력하면 종료
        if (input == "0") return;

        val length = input.length-1
        var answer = true
        // 처음부터 대칭되는 숫자가 동일한지 비교
        for (i in 0 .. length/2) {
            // 동일하지 않은 경우 종료
            if (input[i] != input[length-i]) {
                answer = false
                break
            }
        }

        println(if (answer) "yes" else "no")
    }
}

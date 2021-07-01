/* Baekjoon Online Judge
 * 11050: 이항 계수 1
 * created on 2021.07.02
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    var k = st.nextToken().toInt()

    // 계산 횟수 줄이기
    if (n-k < k) k = n-k

    var answer = 1
    for (i in n-k+1 .. n) {
        answer *= i
    }
    for (i in 1 .. k) {
        answer /= i
    }

    println(answer)
}

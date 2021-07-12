/* Baekjoon Online Judge
 * 1037: 약수
 * created on 2021.07.13
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()

    br.readLine()
    val st = StringTokenizer(br.readLine())

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    while (st.hasMoreTokens()) {
        val num = st.nextToken().toInt()
        if (num < min) min = num
        if (num > max) max = num
    }

    println(min * max)
    br.close()
}

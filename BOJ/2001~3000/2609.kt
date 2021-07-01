/* Baekjoon Online Judge
 * 2609: 최대공약수와 최소공배수
 * created on 2021.07.02
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    var less = a
    var great = b

    if (a > b) {
        less = b
        great = a
    }

    // 최대 공약수 구하기
    var gcm = 1
    for (i in 1 until less) {
        if (less % i == 0 && great % (less / i) == 0) {
            gcm = less / i
            break
        }
    }

    // 최소 공배수 계산
    val lmc = a * b / gcm

    println(gcm)
    println(lmc)
}

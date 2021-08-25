/* Baekjoon Online Judge
 * 1654: 랜선 자르기
 * created on 2021.08.25
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val k = st.nextToken().toInt()
    val n = st.nextToken().toInt()
    val cables = IntArray(n)

    repeat(k) {
        cables[it] = br.readLine().toInt()
    }

    var max = cables.maxOrNull()!!
    var min = 1
    var answer = 0

    // 이분탐색
    while (min <= max) {
        val mid = min + (max-min)/2
        var count = 0

        cables.forEach { count += it/mid }

        if (count >= n) {
            answer = mid

            // 정수 범위를 넘어가지 않게
            if (min == Int.MAX_VALUE) break
            min = mid + 1
        } else {
            max = mid - 1
        }
    }

    bw.write("$answer\n")
    bw.flush()
    bw.close()
    br.close()
}
/* Baekjoon Online Judge
 * 1059: 좋은 구간
 * created on 2021.07.29
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val l = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    val list = IntArray(l)
    repeat(l) {
        list[it] = st.nextToken().toInt()
    }
    val n = br.readLine().toInt()

    if (list.contains(n)) {
        bw.write("0")
        bw.flush()
        return
    }

    var min = 0
    var max = 1001

    // n과 가장 근접한 최소값과 최대값 찾기
    for (i in list.indices) {
        val num = list[i]
        if (num in (n + 1) until max) {
            max = num
        } else if (num in (min + 1) until n) {
            min = num
        }
    }

    // n을 시작으로 하는 좋은 구간 개수 계산
    val right = max-n-1

    // n을 끝으로 하는 좋은 구간 개수 계산
    val left = n-min-1

    // n을 포함하는 좋은 구간 개수 계산
    val answer = right + left + right*left

    bw.write("$answer")

    bw.flush()
    br.close()
}
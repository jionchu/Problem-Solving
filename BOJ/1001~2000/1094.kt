/* Baekjoon Online Judge
 * 1094: 막대기
 * created on 2021.08.09
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val x = br.readLine().toInt()

    // 하나의 막대기로 완성되는 경우
    if (x == 64 || x == 32) {
        bw.write("1")
        bw.flush()
        return
    }

    var half = 32
    var count = 0
    var sum = 0

    // 전체 길이의 합이 x와 같아질 때까지 반복
    while (sum < x) {
        if (sum+half > x) {
            half/=2
        } else {
            sum += half
            count++
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    br.close()
}
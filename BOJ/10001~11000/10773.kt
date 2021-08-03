/* Baekjoon Online Judge
 * 10773: 제로
 * created on 2021.08.03
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val numbers = IntArray(n)
    var index = 0

    repeat(n) {
        val num = br.readLine().toInt()

        // 0 입력 시
        if (num == 0) {
            numbers[--index] = 0
        }
        // 0이 아닌 수 입력 시
        else {
            numbers[index++] = num
        }
    }

    var sum = 0
    // 배열의 모든 수 더하기
    numbers.forEach { sum += it }

    bw.write("$sum\n")
    bw.flush()
    bw.close()
    br.close()
}
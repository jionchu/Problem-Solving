/* Baekjoon Online Judge
 * 2108: 통계학
 * created on 2021.08.02
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val numbers = IntArray(n)
    val count = IntArray(80001)

    var min = 4000
    var max = -4000
    var sum = 0

    var frequent = -40001
    var less = -4001
    var most = 0

    repeat(n) {
        val num = br.readLine().toInt()

        numbers[it] = num
        count[num+4000]++

        if (count[num+4000] > most) {
            most = count[num+4000]
            frequent = num
            less = -4001
        }

        else if (most > 0 && count[num+4000] == most) {
            if (less == -4001) {
                if (frequent > num) {
                    less = num
                } else {
                    less = frequent
                    frequent = num
                }
            }
            else {
                if (less > num) {
                    frequent = less
                    less = num
                } else if (frequent > num) {
                    frequent = num
                }
            }
        }

        sum += num

        if (num < min) min = num
        if (num > max) max = num
    }

    // 정렬
    numbers.sort()

    // 산술평균
    bw.write("${(sum/n.toFloat()).roundToInt()}\n")
    // 중앙값
    bw.write("${numbers[n/2]}\n")
    // 최빈값
    bw.write("$frequent\n")
    // 범위
    bw.write("${max-min}\n")

    bw.flush()
    bw.close()
    br.close()
}
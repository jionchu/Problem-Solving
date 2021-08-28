/* Baekjoon Online Judge
 * 1874: 스택 수열
 * created on 2021.08.28
 * created by jionchu */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val numbers = IntArray(100000)

    val sb = StringBuilder()

    var max = 0
    var index = 0

    for (i in 0 until n) {
        val num = br.readLine().toInt()

        // 수를 push해야 하는 경우
        if (num > max) {
            for (j in max+1 until num) {
                numbers[index++] = j
                sb.append("+\n")
            }
            sb.append("+\n")
            sb.append("-\n")

            max = num
        } 
        // pop해야 하는 경우
        else if (num == numbers[index-1]) {
            sb.append("-\n")
            index--
        }
        // 불가능한 경우
        else {
            sb.clear()
            sb.append("NO\n")
            break
        }
    }

    bw.write("$sb\n")
    bw.flush()
    bw.close()
    br.close()
}
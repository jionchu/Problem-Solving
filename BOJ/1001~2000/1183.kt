/* Baekjoon Online Judge
 * 1183: 약속
 * created on 2021.08.24
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val wait = IntArray(n)

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val origin = st.nextToken().toInt()
        val arrive = st.nextToken().toInt()

        wait[it] = origin - arrive
    }

    wait.sort()

    val answer = if (n % 2 == 0) {
        wait[n/2] - wait[n/2-1] + 1
    } else {
        1
    }

    bw.write("$answer\n")
    bw.flush()
    bw.close()
    br.close()
}
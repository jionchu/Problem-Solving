/* Baekjoon Online Judge
 * 2914: 저작권
 * created on 2021.08.11
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())

    val count = st.nextToken().toInt()
    val avg = st.nextToken().toInt()

    bw.write("${count*(avg-1)+1}\n")
    bw.flush()
    bw.close()
    br.close()
}
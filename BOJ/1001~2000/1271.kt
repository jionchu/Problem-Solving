/* Baekjoon Online Judge
 * 1271: 엄청난 부자2
 * created on 2021.06.30
 * created by jionchu */

import java.io.*
import java.math.BigInteger
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine()
    val st = StringTokenizer(input, " ")
    var all = BigInteger(st.nextToken())
    var count = BigInteger(st.nextToken())

    //각 생명체에게 주는 돈
    println(all/count)
    //나머지
    println(all%count)
}
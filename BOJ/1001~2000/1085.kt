/* Baekjoon Online Judge
 * 1085: 직사각형에서 탈출
 * created on 2021.06.30
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val st = StringTokenizer(input)

    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val h = st.nextToken().toInt()

    val a = if (w-x > x) x else w-x
    val b = if (h-y > y) y else h-y
    
    println(if(a < b) a else b)
}
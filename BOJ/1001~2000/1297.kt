/* Baekjoon Online Judge
 * 1297: TV 크기
 * created on 2021.08.12
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())

    val D = st.nextToken().toInt()
    val H = st.nextToken().toInt()
    val W = st.nextToken().toInt()

    // H와 W에 따른 대각선 비율 구하기
    val diagonal = Math.sqrt((H*H+W*W).toDouble())
    
    // 실제 높이와 너비 계산
    val height = H*D/diagonal
    val width = W*D/diagonal

    bw.write("${height.toInt()} ${width.toInt()}\n")
    bw.flush()
    bw.close()
    br.close()
}
/* Baekjoon Online Judge
 * 11651: 좌표 정렬하기 2
 * created on 2021.07.28
 * created by jionchu */

import java.util.*
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 배열 초기화
    val list = mutableListOf<List<Int>>()

    // 배열에 좌표 저장
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        val dot = listOf(x,y)
        list.add(dot)
    }

    // 정렬
    val result = list.sortedWith(compareBy({it[1]},{it[0]}))

    // 출력
    result.forEach { bw.write("${it[0]} ${it[1]}\n") }

    bw.close()
    br.close()
}
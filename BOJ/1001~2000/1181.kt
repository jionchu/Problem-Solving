/* Baekjoon Online Judge
 * 1181: 단어 정렬
 * created on 2021.07.15
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 배열 초기화
    val list = mutableSetOf<String>()

    // 배열에 단어 저장
    repeat(n) {
        val word = br.readLine()
        list.add(word)
    }

    // 정렬
    val result = list.sortedWith(compareBy({it.length},{it}))

    // 차례대로 출력
    result.forEach { bw.write("${it}\n") }

    bw.close()
    br.close()
}

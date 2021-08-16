/* Baekjoon Online Judge
 * 1158: 요세푸스 문제
 * created on 2021.08.16
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    // 1부터 n까지의 숫자를 담은 배열 정의
    val people = mutableListOf<Int>()
    repeat(n) {
        people.add(it+1)
    }

    // 배열의 크기가 0이 될 때까지 k번째 수를 삭제해나감
    var index = k-1
    bw.write("<${people.removeAt(index--)}")

    while (people.size > 0) {
        index = (index+k) % people.size
        bw.write(", ${people.removeAt(index--)}")
    }

    bw.write(">")
    bw.flush()
    bw.close()
    br.close()
}
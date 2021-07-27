/* Baekjoon Online Judge
 * 11866: 요세푸스 문제 0
 * created on 2021.07.28
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val people = MutableList(n) { x -> x + 1 }
    var index = k-2

    // k번째 사람 삭제하기
    bw.write("<${k}")
    people.removeAt(k-1)

    // k개 간격으로 삭제하기
    while (people.size > 0) {
        index = (index+k) % people.size
        bw.write(", ${people[index]}")
        people.removeAt(index--)
    }

    bw.write(">")

    bw.flush()
    br.close()
}
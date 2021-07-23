/* Baekjoon Online Judge
 * 10816: 숫자 카드 2
 * created on 2021.07.23
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 배열 초기화
    val list = IntArray(20000001) { 0 }

    // 상근이가 가지고 있는 카드 수 계산
    val n = br.readLine().toInt()
    var st = StringTokenizer(br.readLine())
    repeat(n) {
        list[st.nextToken().toInt()+10000000]++
    }

    // 상근이가 가지고 있는지 카드 수 출력
    val m = br.readLine().toInt()
    st = StringTokenizer(br.readLine())
    repeat(m) {
        bw.write("${list[st.nextToken().toInt()+10000000]} ")
    }

    bw.flush()
    br.close()
}
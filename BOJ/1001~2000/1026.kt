/* Baekjoon Online Judge
 * 1026: 보물
 * created on 2021.08.18
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arrayA = IntArray(n)
    val arrayB = IntArray(n)

    var st = StringTokenizer(br.readLine())
    // 배열 A 수 저장
    repeat(n) {
        arrayA[it] = st.nextToken().toInt()
    }

    // 배열 B 수 저장
    st = StringTokenizer(br.readLine())
    repeat(n) {
        arrayB[it] = st.nextToken().toInt()
    }

    // 오름차순 정렬
    arrayA.sort()
    // 내림차순 정렬
    arrayB.sortDescending()

    var answer = 0
    // (가장 작은 수 * 가장 큰 수)부터 순서대로 곱해서 더하기
    repeat(n) {
        answer += arrayA[it]*arrayB[it]
    }

    bw.write("$answer\n")
    bw.flush()
    bw.close()
    br.close()
}
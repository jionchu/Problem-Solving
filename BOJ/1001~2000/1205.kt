/* Baekjoon Online Judge
 * 1205: 등수 구하기
 * created on 2021.09.06
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val score = st.nextToken().toInt()
    val p = st.nextToken().toInt()
    var answer = -1

    var num = 0
    // 랭킹 리스트가 비어있지 않은 경우
    if (n > 0) {
        st = StringTokenizer(br.readLine())
        for (i in 1..n) {
            num = st.nextToken().toInt()
            if (answer < 0 && score >= num) {
                answer = i
            }
        }
    }

    // 점수가 낮아서 마지막에 랭크
    if (answer < 0 && n < p) answer = n + 1
    // 이전 점수보다 더 좋지 않아서 랭킹 리스트에 새로 올라갈 수 없음
    else if (n == p && num == score) answer = -1

    bw.write("$answer\n")
    bw.flush()
    bw.close()
    br.close()
}
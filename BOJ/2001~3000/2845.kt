/* Baekjoon Online Judge
 * 2845: 파티가 끝나고 난 뒤
 * created on 2021.08.08
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    // 상근이가 계산한 참가자 수
    val people = st.nextToken().toInt() * st.nextToken().toInt()

    val numbers = StringTokenizer(br.readLine())
    repeat(5) {
        // 각 기사에 적힌 수와 얼마나 차이가 있는지 출력
        val num = numbers.nextToken().toInt()
        bw.write("${num-people} ")
    }

    bw.flush()
    bw.close()
    br.close()
}
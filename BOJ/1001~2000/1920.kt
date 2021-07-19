/* Baekjoon Online Judge
 * 1920: 수 찾기
 * created on 2021.07.19
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    // set 초기화
    val set = mutableSetOf<Int>()

    // set에 숫자 저장
    val n = br.readLine().toInt()
    var st = StringTokenizer(br.readLine())
    repeat(n) {
        set.add(st.nextToken().toInt())
    }

    val m = br.readLine().toInt()
    st = StringTokenizer(br.readLine())
    repeat(m) {
        // set에 존재하는 경우
        if (set.contains(st.nextToken().toInt())) {
            bw.write("1\n")
        }
        // set에 존재하지 않는 경우
        else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}
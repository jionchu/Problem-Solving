/* Baekjoon Online Judge
 * 1049: 기타줄
 * created on 2021.08.20
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var min = 100000
    var minPack = 1000
    var minOne = 1000

    repeat(m) {
        st = StringTokenizer(br.readLine())
        val pack = st.nextToken().toInt()
        val one = st.nextToken().toInt()

        if (pack < minPack) minPack = pack
        if (one < minOne) minOne = one
    }

    // 모두 낱개로 사는 경우
    if (minOne * n < min) {
        min = minOne * n
    }
    // 모두 패키지로 사는 경우
    if (minPack * (((n-1) / 6) + 1) < min) {
        min = minPack * (((n-1) / 6) + 1)
    }
    // 패키지 + 낱개로 사는 경우
    if (minPack * (n / 6) + minOne * (n % 6) < min) {
        min = minPack * (n / 6) + minOne * (n % 6)
    }

    bw.write("$min\n")
    bw.flush()
    bw.close()
    br.close()
}
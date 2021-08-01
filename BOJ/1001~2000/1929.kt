/* Baekjoon Online Judge
 * 1929: 소수 구하기
 * created on 2021.08.01
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())

    val min = st.nextToken().toInt()
    val max = st.nextToken().toInt()

    val prime = BooleanArray(max+1)

    for (i in 2..max) {
        // 소수가 아닌 경우
        if (prime[i]) continue
        
        // 소수인 경우
        else if (i >= min) bw.write("$i\n")

        checkPrime(i, max, prime)
    }

    bw.flush()
    bw.close()
    br.close()
}

fun checkPrime(num: Int, max: Int, prime: BooleanArray) {

    // num의 배수들에 소수가 아님을 표시
    var n = num * 2

    while (n <= max) {
        prime[n] = true
        n += num
    }
}
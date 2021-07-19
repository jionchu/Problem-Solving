/* Baekjoon Online Judge
 * 1978: 소수 찾기
 * created on 2021.07.19
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine());

    var answer = 0

    repeat(n) {
        // 소수인 경우 개수 증가
        if(isPrime(st.nextToken().toInt())) answer++
    }

    println(answer)
    br.close()
}

// 숫자가 소수인지 확인
fun isPrime(num: Int): Boolean {

    if (num == 1) return false

    var i = 2
    while (i*i <= num) {
        if (num % i++ == 0) return false
    }

    return true
}

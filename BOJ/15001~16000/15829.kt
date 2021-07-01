/* Baekjoon Online Judge
 * 15829: Hashing
 * created on 2021.07.01
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val input = br.readLine().toCharArray()

    //해시 값 초기화
    var answer: Long = 0

    var hash: Long = 1
    //각 문자마다 계산
    for (num in input) {
        //Long 범위를 넘지 않도록 단계마다 mod
        answer = (answer + (num-'a'+1) * hash) % 1234567891
        hash = (hash * 31) % 1234567891
    }

    //해시 값 출력
    println(answer)
}

/* Baekjoon Online Judge
 * 1550: 16진수
 * created on 2021.06.30
 * created by jionchu */

import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().toCharArray()
    var result = 0

    for (c in input) {
        if (c > '9') { //알파벳인 경우
            result = result * 16 + (c - 'A' + 10)
        }
        else { //숫자인 경우
            result = result * 16 + (c - '0')
        }
    }

    //10진수로 변환한 값 출력
    println(result)
}
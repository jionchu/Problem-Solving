/* Baekjoon Online Judge
 * 1032: 명령 프롬프트
 * created on 2021.08.13
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val answer = StringBuilder(br.readLine())
    
    repeat(n-1) {
        val cmd = br.readLine().toCharArray()
        for (i in answer.indices) {
            if (answer[i] != '?' && answer[i] != cmd[i]) answer[i] = '?'
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()
    br.close()
}
/* Baekjoon Online Judge
 * 2338: 긴자리 계산
 * created on 2021.07.14
 * created by jionchu */

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val a = br.readLine().toBigInteger()
    val b = br.readLine().toBigInteger()

    bw.append("${a+b}\n")
    bw.append("${a-b}\n")
    bw.append("${a*b}\n")
    bw.close()
    br.close()
}

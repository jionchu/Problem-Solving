/* Baekjoon Online Judge
 * 10828: 스택
 * created on 2021.07.24
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 스택 구현
    val stack = IntArray(n)
    var pointer = -1

    // 명령 처리
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push" -> stack[++pointer] = st.nextToken().toInt()
            "pop" -> if (pointer == -1) bw.write("-1\n") else bw.write("${stack[pointer--]}\n")
            "size" -> bw.write("${pointer+1}\n")
            "empty" -> if (pointer == -1) bw.write("1\n") else bw.write("0\n")
            "top" -> if (pointer == -1) bw.write("-1\n") else bw.write("${stack[pointer]}\n")
        }
    }

    bw.flush()
    br.close()
}
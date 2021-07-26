/* Baekjoon Online Judge
 * 10845: 큐
 * created on 2021.07.26
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 큐 구현
    val queue = IntArray(n)
    var pointerFront = 0
    var pointerBack = 0

    // 명령 처리
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push" -> queue[pointerBack++] = st.nextToken().toInt()
            "pop" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${queue[pointerFront++]}\n")
            }
            "size" -> bw.write("${pointerBack-pointerFront}\n")
            "empty" -> {
                if (pointerFront == pointerBack) bw.write("1\n")
                else bw.write("0\n")
            }
            "front" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${queue[pointerFront]}\n")
            }
            "back" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${queue[pointerBack-1]}\n")
            }
        }
    }

    bw.flush()
    br.close()
}
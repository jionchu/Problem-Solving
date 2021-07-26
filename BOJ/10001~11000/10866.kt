/* Baekjoon Online Judge
 * 10866: 덱
 * created on 2021.07.27
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 덱 구현
    val deque = IntArray(n*2)
    var pointerFront = n-1
    var pointerBack = n-1

    // 명령 처리
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push_front" -> deque[pointerFront--] = st.nextToken().toInt()
            "push_back" -> deque[++pointerBack] = st.nextToken().toInt()
            "pop_front" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${deque[++pointerFront]}\n")
            }
            "pop_back" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${deque[pointerBack--]}\n")
            }
            "size" -> bw.write("${pointerBack-pointerFront}\n")
            "empty" -> {
                if (pointerFront == pointerBack) bw.write("1\n")
                else bw.write("0\n")
            }
            "front" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${deque[pointerFront+1]}\n")
            }
            "back" -> {
                if (pointerFront == pointerBack) bw.write("-1\n")
                else bw.write("${deque[pointerBack]}\n")
            }
        }
    }

    bw.flush()
    br.close()
}
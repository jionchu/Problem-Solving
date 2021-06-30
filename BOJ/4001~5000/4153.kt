/* Baekjoon Online Judge
 * 4153: 직각삼각형
 * created on 2021.06.30
 * created by jionchu */

import java.util.*

fun main() {

    while (true) {
        val input = readLine()
        val st = StringTokenizer(input, " ")

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()

        // 0 0 0 입력 시 종료
        if (a == 0 && b == 0 && c == 0) return;
        // 직각 삼각형이 맞다면
        else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            println("right")
        }
        // 직각 삼각형이 아니라면
        else {
            println("wrong")
        }
    }
}
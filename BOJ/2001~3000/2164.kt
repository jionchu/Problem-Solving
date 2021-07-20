/* Baekjoon Online Judge
 * 2164: 카드2
 * created on 2021.07.20
 * created by jionchu */

import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()

    val queue = LinkedList<Int>()
    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.pop()
        queue.add(queue.pop())
    }

    println(queue.pop())
    br.close()
}
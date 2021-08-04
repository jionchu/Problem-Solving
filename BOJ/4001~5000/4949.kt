/* Baekjoon Online Judge
 * 4949: 균형잡힌 세상
 * created on 2021.08.04
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val stack = Stack<Char>()
    var str = br.readLine().toCharArray()
    while (str[0] != '.') {
        var check = true

        for (i in str.indices) {
            val c = str[i]

            if (c == '[') stack.push(c)
            else if (c == '(') stack.push(c)
            else if ((c == ']' || c == ')') && stack.size == 0) {
                check = false
                break
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop()
            } else if (c == ']' && stack.peek() != '[') {
                check = false
                break
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop()
            } else if (c == ')' && stack.peek() != '('){
                check = false
                break
            }
        }

        if (!check || stack.size > 0) {
            bw.write("no\n")
        } else {
            bw.write("yes\n")
        }

        stack.clear()
        str = br.readLine().toCharArray()
    }

    bw.flush()
    bw.close()
    br.close()
}
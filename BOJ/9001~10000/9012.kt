/* Baekjoon Online Judge
 * 9012: 괄호
 * created on 2021.07.21
 * created by jionchu */

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    repeat(n) {
        if (isRight(br.readLine()))
            bw.write("YES\n")
        else
            bw.write("NO\n")
    }

    bw.close()
    br.close()
}

fun isRight(bracket: String): Boolean {

    var count = 0

    for (c in bracket.toCharArray()) {
        when {
            c == '(' -> count++
            count == 0 -> return false
            else -> count--
        }
    }

    return count == 0
}
/* Baekjoon Online Judge
 * 2805: 나무 자르기
 * created on 2021.08.23
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val trees = IntArray(n)
    var sum = 0
    var answer = 0

    st = StringTokenizer(br.readLine())
    repeat(n) {
        trees[it] = st.nextToken().toInt()
    }

    // 나무 큰 순서대로 정렬
    trees.sortDescending()
    for (i in 0 until n) {
        if (i == n-1 || sum + (trees[i]-trees[i+1])*(i+1) >= m) {
            answer = trees[i] - Math.ceil((m-sum)/(i+1).toDouble()).toInt()
            break
        } else {
            sum += (trees[i]-trees[i+1])*(i+1)
        }
    }

    bw.write("$answer\n")
    bw.flush()
    bw.close()
    br.close()
}
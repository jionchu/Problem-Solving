/* Baekjoon Online Judge
 * 2798: 블랙잭
 * created on 2021.07.03
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val list = IntArray(n,{0})
    st = StringTokenizer(br.readLine())

    // 카드 저장
    for (i in 0 until n) {
        list[i] = st.nextToken().toInt()
    }

    // 카드 오름차순 정렬
    Arrays.sort(list)

    var answer = 0

    // 정답 찾기
    for (i in 0..n-3) {
        for (j in i+1..n-2) {
            for (k in j+1..n-1) {
                val sum = list[i]+list[j]+list[k]
                if (sum > m) break
                // 3장의 합이 M과 같은 경우
                // M에 더 가까운 수는 없으므로 종료
                else if (sum == m) {
                    println(sum)
                    return
                }
                else if (sum > answer) answer = sum
            }
        }
    }

    println(answer)
}

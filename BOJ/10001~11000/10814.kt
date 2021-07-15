/* Baekjoon Online Judge
 * 10814: 나이순 정렬
 * created on 2021.07.16
 * created by jionchu */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // map 초기화
    val map = mutableMapOf<Int,MutableList<String>>()

    // map에 나이별로 회원정보 저장
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val age = st.nextToken().toInt()
        val name = st.nextToken()

        val list = map.getOrDefault(age, mutableListOf())
        list.add(name)
        map[age] = list
    }

    // 나이순 정렬
    val result = map.toSortedMap()

    // 각 나이 별로
    result.forEach { first ->
        val age = first.key
        first.value.forEach {
            bw.write("$age ${it}\n")
        }
    }

    bw.close()
    br.close()
}

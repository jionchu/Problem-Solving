/* Baekjoon Online Judge
 * 2231: 분해합
 * created on 2021.06.30
 * created by jionchu */

fun main() {

    val input = readLine()!!
    val origin = input.toInt()
    val num = origin - 9 * input.length
    var answer = 0

    for (i in num .. origin) {

        //자리수 합 구하기
        val sum = i + getSum(i)

        //생성자인 경우
        if (sum == origin) {
            answer = i
            break
        }
    }

    println(answer)
}

//자릿수 더하는 함수
fun getSum(num: Int): Int {
    var sum = 0
    var num = num

    while (num > 0) {
        sum += num%10
        num/=10
    }

    return sum
}
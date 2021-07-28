/* Programmers
 * 그래프 - 가장 먼 노드
 * created on 2021.07.28
 * created by jionchu */

import java.util.*

class Solution {
    
    var check = booleanArrayOf(false)
    var queue: Queue<IntArray> = LinkedList<IntArray>()
    
    fun solution(n: Int, edge: Array<IntArray>): Int {
        var answer = 0
        
        // 1번 노드와의 거리를 저장할 배열
        val distance = IntArray(n)
        // 지나간 간선인지 확인할 배열
        check = BooleanArray(edge.size)
        
        // 1번 노드와 연결된 노드 큐에 삽입
        connectNode(edge, 1)
        
        while (queue.size > 0) {
            val vertex = queue.poll()
            val prev = vertex[0]
            val next = vertex[1]
            
            // 현재가 최단거리인 경우
            if (distance[next-1] == 0 || distance[prev-1]+1 < distance[next-1]) {
                
                // 거리 업데이트
                distance[next-1] = distance[prev-1]+1
                
                // 다음 노드로 연결
                connectNode(edge, next)
            }
        }
        
        // 1번 노드에서 가장 멀리 떨어진 노드의 거리
        val max = distance.max()!!
        repeat(n) {
            // 1번 노드에서 가장 멀리 떨어진 노드의 개수
            if (distance[it] == max) answer++
        }
        
        return answer
    }
    
    // 현재 노드에서 이동 가능한 간선들을 통해 다음 노드로 이동하는 함수
    fun connectNode(edge: Array<IntArray>, start: Int) {
        
        repeat(edge.size) {
            if (edge[it][0] == start && !check[it]) {
                queue.add(edge[it])
                check[it] = true
            }
            else if (edge[it][1] == start && !check[it]) {
                queue.add(intArrayOf(edge[it][1],edge[it][0]))
                check[it] = true
            }
        }
    }
}
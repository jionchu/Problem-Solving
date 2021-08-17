/* Programmers
 * 해시 - 베스트앨범
 * created on 2021.08.17
 * created by jionchu */

class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val songs = mutableMapOf<String, MutableList<Int>>()
        val sumOfPlay = mutableMapOf<String, Int>()
        
        repeat(genres.size) {
            val genre = genres[it]
            val prev = songs.getOrDefault(genre, mutableListOf())
            prev.add(it)
            songs[genre] = prev
            sumOfPlay[genre] = sumOfPlay.getOrDefault(genre, 0)+plays[it]
        }
        
        // 재생회수 기준 내림차순 정렬
        val sortedPlays = sumOfPlay.toList().sortedByDescending { it.second }
        
        val answer = mutableListOf<Int>()
        
        // 가장 많이 재생된 장르부터 수록
        for (i in sortedPlays.indices) {
            // 해당 장르의 곡 리스트
            val list = songs[sortedPlays[i].first]!!
            // 재생회수 기준 내림차순 정렬
            list.sortByDescending { plays[it] }
            
            // 가장 많이 재생된 곡
            answer.add(list[0])
            
            // 장르에 속한 곡이 2곡 이상인 경우
            if (list.size > 1) {
                answer.add(list[1])
            }
        }
        
        return answer.toIntArray()
    }
}
/* Programmers
 * 연습문제 - 제일 작은 수 제거하기
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1) //배열의 길이가 1인 경우
            return new int[]{-1};
        else
            answer = new int[arr.length-1];
        
        //배열에서 가장 작은 수 구하기
        int min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (min > arr[i])
                min = arr[i];
        }
        
        //가장 작은 수를 제외하고 저장
        int index = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > min)
                answer[index++] = arr[i];
        }
        
        return answer;
    }
}
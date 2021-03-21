/* E-PPER 15회
 * Q7: 도서관 예약
 * created on 2021.03.21
 * created by jionchu */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Q7 {
    public static void main(String[] args) {
        int[] start = {0, 6, 3, 1, 1, 2};
        int[] end = {3, 7, 10, 5, 9, 8};

        int solution = new Solution().solution(start, end);
        System.out.println(solution);
        //4
    }

    public static class Solution {
        public int solution(int[] start, int[] end) {
            //모든 학생들의 시작 시간과 끝 시간을 배열에 저장
            ArrayList<Student> students = new ArrayList<>();
            for (int i=0;i<start.length;i++) {
                students.add(new Student(start[i],end[i]));
            }

            //끝나는 시간이 빠른 순서대로 오름차순 정렬
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getEnd() - s2.getEnd();
                }
            });

            int answer = 0; //사용 가능한 학생 수
            int nextFirst = 0; //첫번째 좌석 다음 사람이 사용할 수 있는 시각
            int nextSecond = 0; //두번째 좌석 다음 사람이 사용할 수 있는 시각
            for (int i=0;i<students.size();i++) {
                int first = students.get(i).getStart() - nextFirst;
                int second = students.get(i).getStart() - nextSecond;
                if (first >= 0 && second < 0) { //첫번째 좌석만 사용 가능한 경우
                    answer++; //첫번째 좌석 사용
                    nextFirst = students.get(i).getEnd(); //첫번째 좌석 다음 사람이 사용 가능한 시간 변경
                } else if (first < 0 && second >= 0) { //두번째 좌석만 사용 가능한 경우
                    answer++; //두번째 좌석 사용
                    nextSecond = students.get(i).getEnd(); //두번째 좌석 다음 사람이 사용 가능한 시간 변경
                } else if (first >= 0 && second >= 0) { //두 개의 좌석 모두 사용 가능한 경우
                    //사용되지 않는 시간이 짧은 좌석에 넣기
                    if (first < second) {
                        nextFirst = students.get(i).getEnd();
                        answer++;
                    } else {
                        nextSecond = students.get(i).getEnd();
                        answer++;
                    }
                }
            }

            return answer;
        }

        //학생의 시작 시간과 끝 시간을 저장하는 클래스
        public class Student {
            private int start, end;

            public Student(int start, int end) {
                this.start = start;
                this.end = end;
            }

            public int getStart() {
                return start;
            }

            public int getEnd() {
                return end;
            }
        }
    }
}

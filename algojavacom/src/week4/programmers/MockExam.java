package week4.programmers;

import java.util.ArrayList;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] mathOne = {1, 2, 3, 4, 5};
        int[] mathTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] mathThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0, 0, 0};                                // count 배열 선언

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == mathOne[i % 5]) {                 // 5개 기준 반복
                count[0]++;
            }

            if (answers[i] == mathTwo[i % 8]) {                 // 8개 기준 반복
                count[1]++;
            }

            if (answers[i] == mathThree[i % 10]) {              // 10개 기준 반복
                count[2]++;
            }
        }

        int max = Math.max(Math.max(count[0], count[1]), count[2]);     // 카운트 배열 요소 중에 최댓값 찾기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {                                      // count 배열 요소의 값과 최댓값이 같으면 list에 인덱스값을 추가
                list.add(i);                                            // i값을 추가, count 배열 값을 추가하는 것이 아님
            }
        }

        int[] answer = new int[list.size()];                            // list 사이즈 크기의 배열 선언
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i) + 1;                                // 정답결과 출력을 위해 불러온 값에 1을 더해서 배열에 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        MockExam T = new MockExam();
        System.out.println(T.solution(new int[]{1, 3, 2, 4, 2}));
    }
}

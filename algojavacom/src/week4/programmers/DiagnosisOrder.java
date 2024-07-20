package week4.programmers;

import java.util.Arrays;

// 진료순서 정하기
public class DiagnosisOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int count = 1;                                  // count 변수 설정 - 기존 배열 요소가 비교한 요소보다 작으면 증가시킴
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] >= emergency[j]) {
                    continue;
                } else {
                    count++;
                }
            }
            answer[i] = count;                              // count의 값을 answer 배열에 담는다
        }
        return answer;
    }

    public static void main(String[] args) {
        DiagnosisOrder T = new DiagnosisOrder();
        int[] arr = new int[]{3, 76, 24};
        System.out.println(Arrays.toString(T.solution(arr)));
    }
}

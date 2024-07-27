package week5.programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 같은 숫자는 싫어
public class Programmers12906_2 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tempNum = 10;                   // arr 원소 크기 0 ~ 9 => 무의미한 값으로 10 선언하여 배열 요소값과 비교해준다
        for (int num : arr) {
            if (tempNum != num) {           // 같지 않으면 리스트에 추가
                list.add(num);
            }
            tempNum = num;                  // 다음 진행 절차를 위해 tempNum을 num으로
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Programmers12906_2 T = new Programmers12906_2();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}

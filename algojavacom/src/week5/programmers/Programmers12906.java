package week5.programmers;

import java.util.*;

// 같은 숫자는 싫어
public class Programmers12906 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        // 이전 인덱스와 현재 인덱스를 비교하여 리스트에 담는다
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                list.add(arr[i - 1]);
            }
        }

        // 비교 과정에서 마지막 인덱스가 제외되므로 마지막 인덱스를 리스트에 추가시켜준다
        list.add(arr[arr.length - 1]);
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Programmers12906 T = new Programmers12906();
        T.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
    }
}

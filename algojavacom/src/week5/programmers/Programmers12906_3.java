package week5.programmers;

import java.util.Arrays;
import java.util.Stack;

// 같은 숫자는 싫어
public class Programmers12906_3 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // 스택안에 비어있으면 1개를 넣기
        // 제일 위에 값을 꺼내지 않고 같은 값이면 값을 넣지 않음, 값이 다를 경우 스택에 쌓기
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();                    // 스택의 뒤에서 부터 꺼내기 때문에 반대로 반복
        }

        return answer;
    }
    public static void main(String[] args) {
        Programmers12906_3 T = new Programmers12906_3();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}

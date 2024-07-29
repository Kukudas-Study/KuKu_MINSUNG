package week5.recommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 제로
public class Backjoon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int[] arr = new int[stack.size()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}

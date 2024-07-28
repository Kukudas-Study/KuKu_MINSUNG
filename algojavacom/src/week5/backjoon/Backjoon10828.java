package week5.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택
public class Backjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");       // " " 구분자 처리
            String str = st.nextToken();

            if (str.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                switch (str) {
                    case "pop":
                        sb.append((stack.isEmpty() ? -1 : stack.pop())).append("\n");
                        break;
                    case "size":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "empty":
                        sb.append((stack.isEmpty()) ? 1 : 0).append("\n");
                        break;
                    case "top":
                        sb.append((stack.isEmpty()) ? -1 : stack.peek()).append("\n");
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}

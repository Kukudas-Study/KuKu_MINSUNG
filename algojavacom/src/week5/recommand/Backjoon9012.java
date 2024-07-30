package week5.recommand;

import java.io.*;
import java.util.Stack;

public class Backjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            // 공백("") 기준 문자열 split
            // 참고) StringTokenizer 는 공백("") 기준 문자열 split 불가
            String[] targets = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            boolean check = true;
            for (String target : targets) {
                if (target.equals("(")) {
                    stack.push(target);
                } else if (target.equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                        continue;
                    }
                    // ")" 의 검사 대상인 "(" 을 찾으려고 하는데 스택 내에 아무런 요소가 없다면,
                    if (stack.isEmpty()) {
                        check = false;
                        bw.write("NO" + "\n");
                        break;
                    }
                }
            }

            // check 가 true 인 경우는 모든 요소 검사가 정상적으로 다 이뤄졌을 때,
            if (check) {
                if (stack.isEmpty()) {
                    bw.write("YES" + "\n");
                } else {
                    bw.write("NO" + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

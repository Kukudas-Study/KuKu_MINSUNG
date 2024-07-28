package week5.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 덱
public class Backjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "_");
            String str = st.nextToken();

            if (str.equals("push")) {                       // push
                String pushStr = st.nextToken();
                String[] pushArr = pushStr.split(" ");

                if (pushArr[0].equals("front")) {           // push_front
                    deque.addFirst(Integer.parseInt(pushArr[1]));
                } else if (pushArr[0].equals("back")) {     // push_back
                    deque.addLast(Integer.parseInt(pushArr[1]));
                }
            } else if (str.equals("pop")) {                 // pop
                String popStr = st.nextToken();
                String[] popArr = popStr.split(" ");

                if (popArr[0].equals("front")) {            // pop_front
                    sb.append((deque.isEmpty()) ? -1 : deque.removeFirst()).append("\n");
                } else if (popArr[0].equals("back")) {      // pop_back
                    sb.append((deque.isEmpty()) ? -1 : deque.removeLast()).append("\n");
                }
            } else {
                switch (str) {      // 나머지 명령문 처리
                    case "size":
                        sb.append(deque.size()).append("\n");
                        break;
                    case "empty":
                        sb.append((deque.isEmpty()) ? 1 : 0).append("\n");
                        break;
                    case "front":
                        sb.append((deque.isEmpty()) ? -1 : deque.getFirst()).append("\n");
                        break;
                    case "back":
                        sb.append((deque.isEmpty()) ? -1 : deque.getLast()).append("\n");
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}

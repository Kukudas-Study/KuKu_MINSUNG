package week5.backjoon;

import java.io.IOException;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 큐 2
public class Backjoon18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        // 큐가 먼저 들어온 데이터가 먼저 나간다는 특징을 활용 -> 큐의 가장 뒤에 있는 정수 = 가장 먼저 큐에 넣은 정수
        int rearElement = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String[] strArr = str.split(" ");           // " " 구분자 통해 처리
                rearElement = Integer.parseInt(strArr[1]);
                queue.add(rearElement);
            } else {
                switch (str) {
                    case "pop":
                        sb.append((queue.isEmpty()) ? -1 : queue.remove()).append("\n");
                        break;
                    case "size":
                        sb.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        sb.append((queue.isEmpty()) ? 1 : 0).append("\n");
                        break;
                    case "front":
                        sb.append((queue.isEmpty()) ? -1 : queue.peek()).append("\n");
                        break;
                    case "back":
                        sb.append((queue.isEmpty()) ? -1 : rearElement).append("\n");
                        break;
                }
            }
         }
        System.out.println(sb);
    }
}

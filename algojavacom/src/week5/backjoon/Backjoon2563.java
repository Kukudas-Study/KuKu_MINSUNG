package week5.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];                    // 방문 배열 선언
        int sum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;                           // 방문하지 않았다면 true로 표시
                        sum++;                                      // 합 변수 1 증가
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

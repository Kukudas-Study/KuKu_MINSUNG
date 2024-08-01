package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2차원 배열의 합
public class Backjoon2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        // 배열의 합 출력
        for (int count = 0; count < K; count++) {
            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int sum = 0;

            // 행, 열 범위만큼의 누적 합 대입
            for (int k = i; k <= x; k++) {
                for (int l = j; l <= y; l++) {
                    sum += arr[k][l];
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}

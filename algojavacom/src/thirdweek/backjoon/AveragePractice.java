package thirdweek.backjoon;

import java.io.*;
import java.util.StringTokenizer;

// 백준 1546번 - 평균
public class AveragePractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;

        // " " 로 입력한 숫자들 구분
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {                       // 배열에 값 넣어줌
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        System.out.println((double)sum * 100 / max / N);
    }
}

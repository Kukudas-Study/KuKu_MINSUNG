package week4.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10989번 - 수 정렬하기
public class Backjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();         // StringBuilder 를 활용하여 한 번에 출력하기

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);                       // 배열 정렬

        for (int i = 0; i < N; i++){
            sb.append(arr[i]).append("\n");     // "배열 요소 + 개행" 추가
        }
        System.out.println(sb);
    }
}

package week4.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10813 번 - 공 바꾸기
public class BallChange10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 생성
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        for (int i = 0; i < M; i++) {
            int temp = 0;               // 스왑하기 위해 임시변수 생성
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");    // 입력받을 때 " " 로 구분
            int ii = Integer.parseInt(st2.nextToken());
            int jj = Integer.parseInt(st2.nextToken());
            temp = arr[ii - 1];
            arr[ii - 1] = arr[jj - 1];
            arr[jj - 1] = temp;
        }

        for (int arrs : arr) {
            System.out.print(arrs + " ");           // 배열 출력
        }

        br.close();
    }
}

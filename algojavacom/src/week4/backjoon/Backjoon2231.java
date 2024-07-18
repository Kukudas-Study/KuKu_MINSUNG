package week4.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2231 번 - 분해합
public class Backjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int M = 0;                              // 생성자

        for (int i = 0; i <= N; i++) {
            int num = i;
            int sum = 0;                        // 각 자리수를 더한 값을 저장

            while (num > 0) {
                sum += num % 10;                // 자리수 10씩 분해하여 해당 자릿수의 모든 값을 더하여 sum에 저장
                num /= 10;                      // 현재 반복문 도는 num의 값을 10씩 분해하여 계속 반복
            }

            if (sum + i == N) {                 // 만약 현재 i값이랑 해당 자릿수를 누적하여 더한 값과 같을때
                M = i;                         // 생성자
                break;
            }
        }
        System.out.println(M);
    }
}

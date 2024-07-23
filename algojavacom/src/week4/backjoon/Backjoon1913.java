package week4.backjoon;

import java.io.*;

// 달팽이
public class Backjoon1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());                    // N 입력
        int targetNumber = Integer.parseInt(br.readLine());         // targetNumber 입력
        int[][] arr = new int[N][N];                                // 2차원 배열 생성
        int row = N / 2;                                            // 시작 행
        int col = N / 2;                                            // 시작 열
        int limit = 1;                                              // 이동 횟수
        int value = 1;                                              // 초기값

        while (true) {
            for (int i = 0; i < limit; i++) {   // 5번째: 시작점(2, 0) 에 값을 넣어준 다음 위로 이동하여 남은 행에 값들을 증가시켜 넣어준다.
                arr[row--][col] = value++;      // 1번째: 시작점(1, 1) 에 값을 넣어준 다음 위로 이동하기 위해 행의 숫자를 감소시켜준다.
            }

            if (value - 1 == N * N) {           // 처음 value가 1이었으므로 1을 빼준 값이 배열의 길이와 같으면(끝점에 도달했으면) 반복문을 빠져나간다.
                break;
            }

            for (int i = 0; i < limit; i++) {   // 2번째: 시작점(0, 1) 0행 1열의 값을 2로 증가시켜 준 다음 열의 숫자를 증가시켜주고 다음 턴으로 넘어간다.
                arr[row][col++] = value++;
            }

            limit++;                            // 아래로 2번 이동시켜주기 위해 limit 값을 중가시켜준다.
            for (int i = 0; i < limit; i++) {   // 3번째: 시작점(0, 2) 0행 2열의 값을 3으로 증가시킨 다음 행을 2차례 이동함과 동시에 값을 증가시켜준다. (3, 4)
                arr[row++][col] = value++;
            }

            for (int i = 0; i < limit; i++) {
                arr[row][col--] = value++;      // 4번째 시작점(2, 2)를 5로 바꿔준 다음 행을 감소시켜 (2, 1)의 값을 6으로 만들어준다.
            }

            limit++;                            // 나머지 3개 행의 값을 넣어주기 위해 반복횟수를 증가시켜준다. N이 5, 7일 때도 이와 같은 방식이 적용된다.
        }

        StringBuilder sb = new StringBuilder();
        int trow = 0;
        int tcol = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (targetNumber == arr[i][j]) {
                    trow = i + 1;                   // 행 + 1
                    tcol = j + 1;                   // 열 + 1
                }
                sb.append(arr[i][j]).append(" ");   // append로 문자열 정리
            }
            sb.append("\n");                        // 개행
        }
        sb.append(trow).append(" ").append(tcol);
        System.out.println(sb.toString());
    }
}

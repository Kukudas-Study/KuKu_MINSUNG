package week6.backjoon;

// 1 0
// 1 1
// 1 2
// 2 0
// 2 1
// 3 0

// 서로 다른 3개의 1~9의 숫자로 주어진다. (중복되는 숫자가 있으면 안 됨)
// 수의 위치와 숫자가 같으면 스트라이크, 위치는 다르지만 정답에 숫자가 존재하면 볼이다.
// N개의 질문에 응답이 있을 때 정답 가능성이 있는 답의 개수를 결과로 출력한다.

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Backjoon2503 {
    // 숫자 야구 응답 정보 관련 클래스
    static class Info {
        int strike, ball;
        String num;

        public Info(int strike, int ball, String num) {
            this.num = num;
            this.strike = strike;
            this.ball = ball;
        }
    }

    static int N;
    static ArrayList<Info> game = new ArrayList<>();                    // 숫자 야구 응답 저장 리스트
    static ArrayList<String> answer = new ArrayList<>();                // 정답 가능한 숫자 저장 리스트
    static boolean[] numUsing;                                          // 숫자 사용 여부 확인 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        numUsing = new boolean[10];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String number = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            game.add(new Info(strike, ball, number));
        }
        search("", 0);                  // 숫자야구 모든 경우의 수 탐색
        bw.write(answer.size() + "");         // 결과 출력
        bw.flush();
        bw.close();
        br.close();
    }

    // 숫자야구의 모든 경우 고려
    private static void search(String num, int size) {
        // 완성된 경우 모든 응답 만족하는지 확인
        if (size == 3) {
            numCheck(num);
            return;
        }

        // 숫자야구에 나올 수 있는 숫자 만들기
        for (int i = 1; i <= 9; i++) {
            if (!numUsing[i]) {
                numUsing[i] = true;
                search(num + i, size + 1);
                numUsing[i] = false;
            }
        }
    }

    // 숫자가 모든 응답에 만족하는지 확인
    private static void numCheck(String num) {
        // 모든 응답에 대하여 만족하는지 확인
        for (Info cur : game) {
            int strike = 0;
            int ball = 0;

            // 스트라이크 조건 만족 확인
            for (int i = 0; i < 3; i++) {
                if (cur.num.charAt(i) == num.charAt(i)) {
                    strike++;
                }
            }

            if (cur.strike != strike) return;

            // 볼 조건 만족하는지 확인
            for (int i = 0; i < 3; i++) {
                int temp = (i + 1) % 3;
                if (num.charAt(i) == cur.num.charAt(temp)) {
                    ball++;
                }

                temp = (i + 2) % 3;
                if (num.charAt(i) == cur.num.charAt(temp)) {
                    ball++;
                }
            }

            if (cur.ball != ball) return;
        }
        // 모든 조건 만족할 때 추가
        answer.add(num);
    }
}

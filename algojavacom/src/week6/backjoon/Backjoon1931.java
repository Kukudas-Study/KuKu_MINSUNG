package week6.backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 회의실 배정
/*
한 개의 회의실에 회의가 겹치지 않게 최대한 많은 회의를 배정해야 한다.
현재 회의의 종료 시간이 빠를수록 다음 회의와 겹치지 않도록 시작해야 한다.
종료 시간이 빠른 순서대로 정렬해 겹치지 않는 회의실을 적절하게 선택하는 방향으로 문제를 풀어야 한다.
 */
public class Backjoon1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*
        time[][0] 은 시작시점
        time[][1] 은 종료시점
         */
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();      // 시작시간
            time[i][1] = sc.nextInt();      // 종료시간
        }

        // 끝나는 시간 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료 시간이 같을 경우 시작시간이 빠른순으로 정렬
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for (int i = 0; i < N; i++) {
            // 이전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if (prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}

package week4.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2309번 - 일곱 난쟁이
public class Backjoon2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());           // 배열 요소 입력
        }
        br.close();

        Arrays.sort(arr);           // 배열 정렬

        int sum = 0;                // 합 변수 지정
        int result_sum = 0;         // 100을 만들어주기 위한 부분 합 변수 지정

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];          // 부분 합 구하기
        }

        result_sum = sum - 100;     // 부분 합 = 총합 - 100

        int start_idx = 0;          // 시작 인덱스
        int end_idx = 1;            // 끝 인덱스
        int fake_dwart1 = 0;        // 가짜 난쟁이 1
        int fake_dwart2 = 0;        // 가짜 난쟁이 2
        while (true) {              // 구간별로 모든 경우의 수를 확인, 만약 두 요소를 더했을 때 부분 합과 같은 경우 반복문 빠져나오기
            if (arr[start_idx] + arr[end_idx] == result_sum) {
                fake_dwart1 = arr[start_idx];
                fake_dwart2 = arr[end_idx];
                break;
            } else {
                if (end_idx == arr.length - 1) { // 끝 인덱스가 배열의 길이와 같으면 (배열의 끝자락에 도달하게 되면)
                    start_idx++;                 // 시작 인덱스를 증가
                    end_idx = start_idx + 1;     // 끝 인덱스 = 시작인덱스 + 1 로 만들어줌
                } else {
                    end_idx++;                   // 끝 인덱스가 배열의 길이와 같지 않은 경우라면 그냥 1 증가시켜줌
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {                          // 배열 출력
            if (arr[i] == fake_dwart1 || arr[i] == fake_dwart2) {       // 만약에 배열 요소가 난쟁이 1 또는 난쟁이 2와 같은 경우
                continue;                                               // 해당 요소들은 건너뜀
            }
            System.out.println(arr[i]);                                 // 건너뛴 요소들 제외한 배열요소들만 출력하기
        }
    }
}


//// 문제 설명 ////
// [7, 8, 10, 13, 15, 19, 20, 23, 25]
//Sum = 140 - arr[arr.length - 1]
//Sum = 140 - 40 = 100 (15, 25)
//result_sum = 40


/*
40 = 15 + 25
Start, end
찾은 수들만큼 배열의 길이에서 제거시켜줘야 함
(arr.length - 2) => for문
15, 25 - continue
 */
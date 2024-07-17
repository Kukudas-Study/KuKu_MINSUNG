package week4.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

// 3052번 - 나머지
public class Rest3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();         // Set 자료 구조를 활용하여 중복 제거

        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);      // 입력받은 수를 42로 나눈 나머지 수 추가
        }
        System.out.println(set.size());         // Set의 길이를 출력
        br.close();                             // 스트림 닫기
    }
}

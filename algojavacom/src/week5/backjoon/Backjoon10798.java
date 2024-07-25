package week5.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Backjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int maxlength = 0;                                      // 리스트 최대 길이 선언

        for (int i = 0; i < 5; i++) {
            stringList.add(br.readLine());
            if (maxlength < stringList.get(i).length()) {       // 리스트 요소의 최대 길이 찾기
                maxlength = stringList.get(i).length();
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() < maxlength) {       // 리스트의 요소 길이를 동일하게 맞춰주기
                stringList.set(i, stringList.get(i) + " ".repeat(maxlength - stringList.get(i).length()));
            }
        }

        for (int i = 0; i < maxlength; i++) {
            for (int j = 0; j < 5; j++) {
                if (stringList.get(j).charAt(i) == ' ') {       // 리스트 문자열의 문자가 ' ' 인 경우 추가하지 않기
                    continue;
                }
                sb.append(stringList.get(j).charAt(i));
            }
        }
        System.out.println(sb);
    }
}

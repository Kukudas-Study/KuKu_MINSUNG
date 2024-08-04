package week6.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 폴리오미노
// AAAA, BB
// 2개 다 만족하는 경우
// AAAA만 만족하는 경우
// BB만 만족하는 경우
// '.'는 폴리오미노로 덮으면 안 됨
// AAAABB, AAAA, BB, AAAAAAAA

public class Backjoon1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("XXXX", "AAAA").replaceAll("XX", "BB");

        if (str.contains("X")) {
            str = "-1";
        }
        System.out.println(str);
    }
}

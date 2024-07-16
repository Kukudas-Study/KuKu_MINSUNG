package thirdweek.backjoon;
import java.util.*;
import java.io.*;

// 백준 10988번 - 팰린드롬인지 확인하기
public class Panlindrom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        System.out.println(str.equals(reverseStr) ? 1 : 0);
    }
}

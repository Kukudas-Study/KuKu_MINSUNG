package week5.backjoon;

import java.io.*;
import java.util.*;

// 커트라인
public class Backjoon25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] numlist = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            numlist[i] = Integer.parseInt(st2.nextToken());
        }
        
        Arrays.sort(numlist);

        System.out.println(numlist[numlist.length - K]);
    }
}

package thirdweek.programmers;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class ListSlicing {
    static int[] arr;
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[slicer.length - 3];      // 1
        int b = slicer[slicer.length - 2];      // 5
        int c = slicer[slicer.length - 1];      // 2

        switch (n) {
            case 1:
                arr = new int[b + 1];
                for (int i = 0; i < b + 1; i++) {
                    arr[i] = num_list[i];
                }
                break;
            case 2:
                arr = new int[num_list.length - a];
                for (int i = a; i < num_list.length; i++) {
                    arr[i - a] = num_list[i];
                }
                break;
            case 3:
                arr = new int[b - a + 1];
                for (int i = a; i < b + 1; i++) {
                    arr[i - a] += num_list[i];
                }
                break;
            case 4:
                int count = (b - a + 1) / c;
                if ((b - a + 1) % c != 0) {
                    count++;
                }
                arr = new int[count];

                int idx = 0;
                for (int i = a; i <= b; i += c) {
                    arr[idx++] = num_list[i];
                }
                break;
            default:
                arr = new int[0];
        }

        int[] answer = {};
        answer = arr;
        return answer;
    }
    public static void main(String[] args) {
        ListSlicing T = new ListSlicing();
        System.out.println(Arrays.toString(T.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }
}

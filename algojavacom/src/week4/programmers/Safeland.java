package week4.programmers;

import java.util.ArrayList;

public class Safeland {
    public int solution(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        // 행, 열 방향 배열 선언
        int[] dRow = {0, 1, -1, 0, -1, 1, 1, -1};
        int[] dCol = {1, 0, 0, -1, -1, 1, -1, 1};

        // 지뢰 위치 확인 후 리스트에 담기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int[] temp = {i, j};
                    list.add(temp);
                }
            }
        }

        // 방향: 오른쪽, 아래쪽, 위쪽, 왼쪽, 2사분면 대각방향쪽, 4사분면 대각방향쪽, 3사분면 대각방향쪽, 1사분면 대각방향쪽 확인 필요
        for (int mine = 0; mine < list.size(); mine++) {
            int i = list.get(mine)[0];
            int j = list.get(mine)[1];
            for (int k = 0; k < 8; k++) {
                if (dRow[k] + i >= 0 && dCol[k] + j >= 0 && 
                        dRow[k] + i <= board.length - 1 && dCol[k] + j <= board.length - 1) {
                    board[dRow[k] + i][dCol[k] + j] = 1;
                }
            }
        }

        // 배열 중에 0인 요소만 선택하여 확인되면 answer 변수를 증가시켜준다
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Safeland T = new Safeland();
        int[][] arr = new int[5][5];
        arr = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr));
    }
}

package week6.programmers;

// 콜라 문제
// 빈 병 2개 -> 콜라 1병 준다.
// 빈 병 20개 -> 콜라 10병
// 단 보유 중인 빈 병이 2개 미만이면 콜라를 받을 수 없다!
/*
빈 병 a개 -> b병을 준다.
빈병 2병을 가져다주면 1개를 받는다.
빈병 3병을 가져다주면 1개를 받는다.
 */

/*
20 / 2 => 10
10 / 2 => 5
5 / 2 => 2
2 / 2 => 1
 */

/*
20 / 3 = 몫 + 나머지 (6 + 2) * b
(6 + 2) / 3 = 2 (몫 + 나머지) (2 + 2) * b
(2 + 2) / 3 = 1 (몫 + 나머지) (1 + 1) * b
 */

public class Programmers132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n % a) + (n / a) * b;      // 빈병 a개를 가져다주면 받는 콜라병수 (n / a) * b
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers132267 T = new Programmers132267();
        System.out.println(T.solution(2, 1, 20));
    }
}

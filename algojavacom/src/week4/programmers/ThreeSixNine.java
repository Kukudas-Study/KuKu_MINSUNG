package week4.programmers;

// 369 게임
public class ThreeSixNine {
    public int solution(int order) {
        int answer = 0;

        String strOrder = String.valueOf(order);

        for (int i = 0; i < strOrder.length(); i++) {
            // Character.getNumericValue: 유니코드 값을 int 형으로 반환해준다.
            if ((Character.getNumericValue(strOrder.charAt(i))) == 3) {
                answer++;
            } else if ((Character.getNumericValue(strOrder.charAt(i))) == 6) {
                answer++;
            } else if ((Character.getNumericValue(strOrder.charAt(i))) == 9) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ThreeSixNine T = new ThreeSixNine();
        System.out.println(T.solution(356));
    }

}

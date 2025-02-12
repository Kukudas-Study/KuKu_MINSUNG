

class Solution {
    public int[] solution(long n) {
        // 입력받은 숫자를 문자열로 반환한다.
        String str = Long.toString(n);

        // 문자열을 뒤집는다.
        String reversed = new StringBuilder(str).reverse().toString();

        // 뒤집힌 문자열을 문자의 배열로 반환한다.
        char[] arr = reversed.toCharArray();

        // 배열의 각 문자를 정수로 반환한다.
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        } 
    }
}
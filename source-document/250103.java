
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long start = x;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start += x;
        }
        
        return answer;
    }
}


// 내림차순 정렬
class Solution {
    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        
        // long 타입 숫자를 int 배열로 옮긴다
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            arr[i] = Integer.parseInt(s);
        }
        
        // 내림차순 정렬
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < str.length(); i++) {
            answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }
}
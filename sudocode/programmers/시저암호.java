
public class Solution {

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }

        return sb.toString();
    }

    private char push(char c, int n) {
        // 알파벳이 아니면 return 처리
        if (!Character.isAlphabetic(c)) return c;

        // 대문자이면 'A', 소문자이면 'a' 반환 (offset - 상대 위치값 구하기)
        int offset = Character.isUpperCase(c)

        // 위치 계산
        int position = c - offset;
        
        // 나머지 계산을 통해 마지막 문자가 알파벳의 첫 글자로 리턴되도록 구성 (나머지 연산 활용)
        position = (position + n) % ('Z' - 'A' + 1);        

        // 문자로 리턴 (offset + 위치)
        return (char) (offset + postiion);
    }

}
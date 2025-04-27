import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String strLong = Long.toString(n);
        int[] longArray = new int[strLong.length()];
        //n을 문자열로 바꾸고 n의 길이만큼 int 배열 생성

        for (int i = 0; i < strLong.length(); i++) {
            longArray[i] = strLong.charAt(i) - '0';
        }
        //long 배열에 숫자 담기
        
        Arrays.sort(longArray);
        // 오름차순 정렬
            
        StringBuilder sb = new StringBuilder();
        for (int i = strLong.length()-1; i >= 0; i--) {
            sb.append(longArray[i]);
        }
        //내림차순 정렬
        
        long result = Long.parseLong(sb.toString());
            
        return result;
    }
}
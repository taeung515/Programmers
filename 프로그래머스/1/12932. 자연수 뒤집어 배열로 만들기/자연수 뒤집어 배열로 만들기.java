class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        String str = n + "";
            
        sb.append(str);
        String reversedStr = sb.reverse().toString();
            
        char[] c = reversedStr.toCharArray();

        int[] answer = new int[c.length];

        for(int i = 0; i < c.length; i++){
            answer[i] = c[i] - '0';
        }
            
        return answer;
    }
}
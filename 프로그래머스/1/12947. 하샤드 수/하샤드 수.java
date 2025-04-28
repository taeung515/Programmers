class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = x + "";
        char[] c = str.toCharArray();
        
        int sum = 0;
        for(int i = 0; i < c.length; i++){
            sum += c[i] -'0';
        }
        
        answer = x % sum == 0;
        
        return answer;
    }
}
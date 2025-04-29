class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        
        if(s.length() % 2 != 0){
            answer = String.valueOf(c[s.length()/2]);
        }else{
            answer = String.valueOf(c[s.length()/2 - 1]) + String.valueOf(c[s.length()/2]);
        }
        
        return answer;
    }
}
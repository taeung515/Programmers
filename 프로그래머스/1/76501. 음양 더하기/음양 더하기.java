class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++){
            int j = signs[i] ? absolutes[i] : -absolutes[i];
            answer += j;
        }
        
        return answer;
    }
}
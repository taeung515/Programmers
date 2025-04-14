class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int idx = 0; idx < included.length; idx++){
            if(included[idx]){
                answer += a;
            }
            a = a + d;
        }
        return answer;
    }
}
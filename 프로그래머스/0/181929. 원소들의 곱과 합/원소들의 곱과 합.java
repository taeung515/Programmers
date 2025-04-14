class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int answer2 = 0;
    for(int i : num_list){
        answer *= i;
    }
    for(int i : num_list){
        answer2 += i; 
    }
        answer2 = answer2*answer2;
        
        return answer > answer2 ? 0 : 1;
    }
}
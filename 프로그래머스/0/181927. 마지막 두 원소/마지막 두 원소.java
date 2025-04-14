class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for(int idx = 0; idx < num_list.length; idx++){
            answer[idx] = num_list[idx];
        }
        
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        
        answer[answer.length - 1] = a > b ? a - b : a * 2;
        
        return answer;
    }
}
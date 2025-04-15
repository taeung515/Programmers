class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        for(int idx = 1; idx < k; idx++){
            answer += 2;
            answer %= numbers.length;
        }
        
        int result = numbers[answer];
            
        return result;
    }
}
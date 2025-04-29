class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < 10; i++){
            boolean found = true;
            
            for(int num : numbers){
                if(i == num){
                    found = false;
                    continue;
                }
            }
            
            if(found){
                answer += i;
            }
        }
        
        return answer;
    }
}
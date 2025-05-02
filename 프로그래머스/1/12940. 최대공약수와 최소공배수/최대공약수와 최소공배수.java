class Solution {
    public int[] solution(int n, int m) {        
        int bigNum = n > m ? n : m;
        
        int num1 = 0;
        
        for(int i = 1; i <= bigNum; i++){
            if(n % i == 0 && m % i ==0){
                num1 = i;
            }
        }
        
        int num2 = n * m / num1;
        int[] answer = {num1, num2};
        
        return answer;
    }
}
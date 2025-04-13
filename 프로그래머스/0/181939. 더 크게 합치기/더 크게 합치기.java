class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        
        if(i > j){
            answer = i;
        }else if(j > i){
            answer = j;
        }else if (i == j){
            answer = i;
        }
        
        return answer;
    }
}
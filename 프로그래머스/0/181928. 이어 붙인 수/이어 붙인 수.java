class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        
        for(int idx = 0; idx < num_list.length; idx++){
            if(num_list[idx] % 2 == 0){
                even += num_list[idx];
            }else{
                odd += num_list[idx];
            }
            
        }
        int a = Integer.parseInt(even);
        int b = Integer.parseInt(odd);
        
        return a + b;
    }
}
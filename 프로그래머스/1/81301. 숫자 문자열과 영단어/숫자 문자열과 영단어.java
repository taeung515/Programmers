class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] nums = {"zero",
                         "one",
                         "two",
                         "three",
                         "four",
                         "five",
                         "six",
                         "seven",
                         "eight",
                         "nine"};
        
        int num1 = 0;
        for (String num : nums) {
            if (s.contains(num)){
                s = s.replace(num, String.valueOf(num1));
            }
            num1++;
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
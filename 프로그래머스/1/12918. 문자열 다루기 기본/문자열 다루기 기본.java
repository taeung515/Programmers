class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            try{
                int i = Integer.parseInt(s);
                answer = true;
            } catch(NumberFormatException e){
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< phone_number.length()-4; i++){
            sb.append('*');
        }
        answer = sb.append(phone_number.substring(phone_number.length()-4)).toString();
        
        return answer;
    }
}
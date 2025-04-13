class Solution {
    public String solution(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < ch1.length; i++){
            sb.append(ch1[i]).append(ch2[i]);
        }
        
        return sb.toString();
    }
}
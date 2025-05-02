class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                if(j % 2 == 0){
                    sb.append(Character.toUpperCase(str[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            if(i < str.length - 1){
                sb.append(" ");
            }
        }

        answer = sb.toString();
        return answer;
    }
}

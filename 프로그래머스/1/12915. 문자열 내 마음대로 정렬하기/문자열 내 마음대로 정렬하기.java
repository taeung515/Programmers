import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer= new String[strings.length];
        
        List<String> strs = new ArrayList<>();
        for (String str : strings) {
            strs.add(str.charAt(n) + "," + str);
        }
        Collections.sort(strs);
        for (int i = 0; i < strs.size();i++ ){
            String str = strs.get(i).split(",")[1];
            answer[i] = str;
        }
        
        return answer;
    }
}
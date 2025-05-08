class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        for(int i = 0; (i + p.length() - 1) < t.length(); i++){
            long tNum = Long.parseLong(t.substring(i, i + p.length()));
            long pNum = Long.parseLong(p);
            if(tNum <= pNum){
                cnt++;
            }
        }
        return cnt;
    }
}
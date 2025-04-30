class Solution {
    public String solution(int n) {
        String answer = "";
        answer = n % 2 == 0 ? "수박".repeat(n/2) : "수박".repeat(n/2) + "수";
        return answer;
    }
} 
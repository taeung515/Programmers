class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sumPrice = 0;
        
        while(count != 0){
            sumPrice += price * count;
            count--;
        }
        answer = sumPrice > money ? (sumPrice-money): 0;

        return answer;
    }
}
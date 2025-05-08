class Solution {
    public int solution(int[] number) {
        int cnt = 0;
        for(int i = 0; i < number.length - 2; i++){
            for(int j = i + 1; j < number.length - 1; j++){
                for(int k = j + 1; k < number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    if(sum == 0){
                        cnt++;
                    }
                }
            }
        }
        if(cnt == 0){
            System.out.println("삼총사가 될 수 있는 방법이 없습니다.");
        }
        return cnt;
    }
}
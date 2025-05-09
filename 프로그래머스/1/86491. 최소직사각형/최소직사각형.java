class Solution {
    public int solution(int[][] sizes) {
        int rowMax = 0;  
        int columnMax = 0;

        for(int[] size : sizes){
            int width = Math.max(size[0], size[1]); 
            int height = Math.min(size[0], size[1]); 

            rowMax = Math.max(rowMax, width);
            columnMax = Math.max(columnMax, height);
        }

        return rowMax * columnMax; 
    }
}
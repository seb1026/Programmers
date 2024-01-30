class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        for(int k=0; k<sizes.length; k++) {
            if(sizes[k][0] < sizes[k][1]) {
                int tmp = sizes[k][0];
                sizes[k][0] = sizes[k][1];
                sizes[k][1] = tmp;
            }
        }
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > max1) {
                max1 = sizes[i][0];
            }
            if(sizes[i][1] > max2) {
                max2 = sizes[i][1];
            }
        }
        
        answer = max1 * max2;
        
        return answer;
    }
}
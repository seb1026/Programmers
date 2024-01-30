class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int brown_size = 0;
        int yellow_size = 0;
        for(int i=3; i<=(brown+yellow)/2; i++) {
            if((brown+yellow)%i == 0) {
                yellow_size = i;
                brown_size = (brown+yellow) / i;
                if(brown == yellow_size*2+(brown_size-2)*2 && yellow == (brown_size-2) * (yellow_size-2)) {
                    break;                    
                }
            }
        }
        answer[0] = brown_size;
        answer[1] = yellow_size;
        return answer;
    }
}
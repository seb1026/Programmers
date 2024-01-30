class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int k = section[0];
        while(true) {
            answer++;
            k += m;
            int cnt = 0;
            for(int i=0; i<section.length; i++) {
                if(section[i] >= k) {
                    k = section[i];
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) {
                break;
            }
        }
        
        return answer;
    }
}
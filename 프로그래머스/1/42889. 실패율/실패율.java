class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] rate = new double[N];
        
        for(int i=1; i<=N; i++) {
            int total = 0;
            int curr = 0;
            int cnt = 0;
            for(int j=0; j<stages.length; j++) {
                if(stages[j] > i) {
                    total++;
                    cnt++;
                }
                if(stages[j] == i) {
                    total++;
                    curr++;
                    cnt++;
                }
            }
            if(cnt == 0) {
                rate[i-1] = 0;
            }
            else {
                rate[i-1] = (double)curr/total;
            }
        }
        
        int x = 0;
        while(N>0) {
            double max = rate[0];
            int idx = 0;
            for(int k=0; k<rate.length; k++) {
                if(rate[k] > max) {
                    max = rate[k];
                    idx = k;
                }
            }
            answer[x] = idx+1;
            rate[idx] = -1;
            
            x++;
            N--;
        }
        
        return answer;
    }
}
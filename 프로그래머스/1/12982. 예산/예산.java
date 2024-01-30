import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int n = 0;
        for(int i=0; i<d.length; i++) {
            System.out.println(d[i]);
            n += d[i];
            if(budget >= n) {
                answer++;
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=citations[citations.length-1]; i>0; i--) {
            int count = 0;
            for(int j=0; j<citations.length; j++) {
                if(i <= citations[j]) {
                    count++;
                }
            }
            //System.out.println(answer +" " +i);
            if(count >= i) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
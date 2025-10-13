class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=0; i<numLog.length-1; i++) {
            int k = numLog[i+1]-numLog[i];
            if(k == 1) answer += "w";
            else if(k == -1) answer += "s";
            else if(k == 10) answer += "d";
            else if(k == -10) answer += "a";
        }
        
        return answer;
    }
}
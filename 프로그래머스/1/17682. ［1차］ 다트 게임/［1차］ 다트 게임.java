import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] charArr = dartResult.toCharArray();
        int[] scores = new int[3];
        int idx = 0;
        
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] >= '0' && charArr[i] <= '9') {
                if(charArr[i] == '1' && charArr[i+1] == '0') {
                    scores[idx] = 10;
                    idx++;
                    i++;
                }
                else {
                    scores[idx] = charArr[i] - 48;
                    idx++;
                }
            }
            
            else if(charArr[i] == 'S') {
                scores[idx-1] = (int)Math.pow(scores[idx-1], 1);
            }
            
            else if(charArr[i] == 'D') {
                scores[idx-1] = (int)Math.pow(scores[idx-1], 2);
            }
            
            else if(charArr[i] == 'T') {
                scores[idx-1] = (int)Math.pow(scores[idx-1], 3);                
            }
            
            else if(charArr[i] == '*') {
                scores[idx-1] *= 2;
                if(idx != 1) {
                    scores[idx-2] *= 2;
                }
            }
            
            else if(charArr[i] == '#') {
                scores[idx-1] *= -1;
            }
        }
        
        for(int i : scores) {
            answer += i;
        }
        
        return answer;
    }
}
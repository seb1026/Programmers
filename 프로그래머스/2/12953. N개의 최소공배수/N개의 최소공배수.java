import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            int gcd = gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
    
    public int gcd(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        
        while(x % y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        
        return y;
    }
}
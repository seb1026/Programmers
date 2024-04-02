import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Long.toString(n,k);
        String[] str = s.split("0");
        
        for(String p : str) {
            if(p.equals("1") || p.equals("")) continue;
            if(isPrime(Long.parseLong(p))) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;
        
        int count = 0;
        
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
}
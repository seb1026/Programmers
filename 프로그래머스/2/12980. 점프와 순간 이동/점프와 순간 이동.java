import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        while(n > 0) {
            int k = 1;
            while(k <= n) {
                k *= 2;
            }
            if(k != 1) n -= k/2;
            //else n -= k;
            ans++;
        }

        return ans;
    }
}
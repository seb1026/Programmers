class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1; int y = 2;
        
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        for(int i=3; i<=n; i++) {
            answer = (x + y) % 1000000007;
            x = y;
            y = answer;
        }
        
        return answer;
    }
}
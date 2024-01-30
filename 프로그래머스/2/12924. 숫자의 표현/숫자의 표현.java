class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n % 2 == 1 && n != 1) answer++;
        
        for(int i=1; i<n/2; i++) {
            int sum = i;
            for(int j=i+1; j<n; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }
                else if(sum > n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}
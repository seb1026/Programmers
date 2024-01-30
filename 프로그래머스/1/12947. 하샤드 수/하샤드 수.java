class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = 0;
        int a = x;
        while(a>0) {
            n += a%10;
            a /= 10;
        }
        if(x%n!=0) {
            answer = false;
        }
        return answer;
    }
}
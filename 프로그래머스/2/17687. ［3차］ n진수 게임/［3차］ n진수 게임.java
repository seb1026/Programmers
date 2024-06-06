class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int i = 0;  // 현재숫자
        int j = 1;  // 현재순서
        
        while(true) {            
            String s = Integer.toString(i,n);
            for(int k=0; k<s.length(); k++) {
                if(j == p) {
                    answer+=s.substring(k, k+1);
                }
                if(answer.length() == t) return answer.toUpperCase();
                j++;
                if(j > m) {
                    j = 1;
                }
            }
            i++;
        }
    }
}
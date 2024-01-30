class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1;
        for(int i=1; i<s.length(); i++) {
            int n = s.lastIndexOf(s.substring(i, i+1), i-1);            
            if(n != -1) {
                answer[i] = i-n;
            }
            else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
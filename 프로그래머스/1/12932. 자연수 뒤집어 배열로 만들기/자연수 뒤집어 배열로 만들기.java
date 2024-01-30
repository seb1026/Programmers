class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        int aa = 0;
        answer = new int[str.length()];
        for(int i=str.length()-1; i>=0; i--) {
            answer[aa] = str.charAt(i)-48;
            aa++;
        }
        
        return answer;
    }
}
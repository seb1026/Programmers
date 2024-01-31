class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++) {
            String str = babbling[i];
            String[] arr = str.split("aya|ye|woo|ma");
            if(arr.length == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        String n_str = Integer.toBinaryString(n);
        int n_cnt = 0;
        for(int i=0; i<n_str.length(); i++) {
            if(n_str.charAt(i) == '1') {
                n_cnt++;
            }
        }
        int next = n;
        while(true) {
            next++;
            String next_str = Integer.toBinaryString(next);
            int next_cnt = 0;
            for(int i=0; i<next_str.length(); i++) {
                if(next_str.charAt(i) == '1') {
                    next_cnt++;
                }
            }
            if(n_cnt == next_cnt) {
                answer = next;
                break;
            }
        }
        return answer;
    }
}
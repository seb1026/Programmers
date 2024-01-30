class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int conv = 0;
        
        while(!s.equals("1")) {
            conv++;
            String new_s = "";
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) != '0') {
                    new_s += s.substring(i, i+1);
                }
                else {
                    cnt++;
                }
            }
            int n = new_s.length();
            s = Integer.toBinaryString(n);
        }
        
        //System.out.println(Integer.toBinaryString(3));
        answer[0] = conv;
        answer[1] = cnt;
        return answer;
    }
}
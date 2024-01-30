class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++) {
            String s1 = s.substring(i, i+1);
            if(s1.equals("y")) {
                y++;
            }
            else if(s1.equals("p")) {
                p++;
            }
        }
        
        if(p!=y) {
            answer = false;
        }
        else if(p==y || (p==0 && y==0)) {
            answer = true;
        }

        return answer;
    }
}
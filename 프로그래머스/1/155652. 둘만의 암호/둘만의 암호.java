class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            for(int j=0; j<index; j++) {
                c++;
                if(c >= 123) {
                    c = 97;
                }
                while(true) {
                    if(skip.contains(Character.toString(c))) {
                        c++;
                        if(c >= 123) {
                            c = 97;
                        }
                    }    
                    else {
                        break;
                    }
                }
            }

            answer += Character.toString(c);;
        }
        
        return answer;
    }
}
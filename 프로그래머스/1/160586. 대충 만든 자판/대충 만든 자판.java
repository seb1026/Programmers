class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++) {
            int sum = 0;
            for(int j=0; j<targets[i].length(); j++) {
                int idx = 100;
                char c = targets[i].charAt(j);
                for(int k=0; k<keymap.length; k++) {
                    for(int l=0; l<keymap[k].length(); l++) {
                        char chk = keymap[k].charAt(l);
                        if(c == chk) {
                            if(idx > l+1) {
                                idx = l+1;
                            }
                            break;
                        }
                    }
                }
                //System.out.println(idx);
                if(idx != 100)
                    sum += idx;
                else {
                    sum = 100;
                    break;
                }
            }
            if(sum == 100) {
                answer[i] = -1;
            }
            else {
                answer[i] = sum;
            }
        }
        
        return answer;
    }
}
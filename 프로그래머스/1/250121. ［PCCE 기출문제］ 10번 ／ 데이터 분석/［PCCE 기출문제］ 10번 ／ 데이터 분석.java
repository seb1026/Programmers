import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        String[] s = {"code", "date", "maximum", "remain"};
        int ext_idx = 0;
        int sort_by_idx = 0;
        
        for(int i=0; i<4; i++) {
            if(ext.equals(s[i])) ext_idx = i;
            if(sort_by.equals(s[i])) sort_by_idx = i;
        }
        
        for(int i=0; i<data.length; i++) {
            if(data[i][ext_idx] < val_ext) {
                answer.add(data[i]);
            }
        }
        
        final int idx = sort_by_idx;
        Collections.sort(answer, (o1, o2) -> o1[idx]-o2[idx]);
        
        return answer;
    }
}
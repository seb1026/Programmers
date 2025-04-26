import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<intervals.length; i++) {
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
                arrayList.add(arr[j]);
            }
        }
        
        answer = new int[arrayList.size()];
        int idx = 0;
        for(int k : arrayList) {
            answer[idx] = k;
            idx++;
        }
        
        return answer;
    }
}
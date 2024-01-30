import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
        	if(i + 2 >= nums.length) break;
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int n = nums[i]+nums[j]+nums[k];
                    arrayList.add(n);
                }
            }
        }
        
        for(Integer i : arrayList) {
            int cnt = 0;
            for(int m=2; m<i; m++) {
                if(i % m == 0) {
                    cnt++;
                }
            }
            if(cnt == 0) {
                answer++;
            }
        }
                

        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] temp = new int[nums.length/2];
        
        Arrays.sort(nums);
        temp[0] = nums[0];
        int j = 0;
        for(int i=1; i<nums.length; i++) {
            if(temp[j] != nums[i]) {
                j++;
                if(j >= temp.length) {
                    break;
                }
                temp[j] = nums[i];
            }
        }
        
        
        for(int i=0; i<temp.length; i++) {
            if(temp[i] != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
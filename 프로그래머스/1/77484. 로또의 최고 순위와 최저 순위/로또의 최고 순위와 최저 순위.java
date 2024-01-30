import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int cnt = 0;
        int fail= 0;
        
        // Arrays.sort(lottos);
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] != 0) {
                for(int j=0; j<win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        cnt++;
                    }
                }
            }
            else {
                fail++;
            }
            System.out.print(lottos[i]);
        }
        
        int rank = fail + cnt;
        if(rank==6) {
            answer[0] = 1;
        }
        else if(rank==5) {
            answer[0] = 2;
        }
        else if(rank==4) {
            answer[0] = 3;
        }
        else if(rank==3) {
            answer[0] = 4;
        }
        else if(rank==2) {
            answer[0]= 5;
        }
        else {
            answer[0] = 6;
        }
        
        if(cnt==6) {
            answer[1] = 1;
        }
        else if(cnt==5) {
            answer[1] = 2;
        }
        else if(cnt==4) {
            answer[1] = 3;
        }
        else if(cnt==3) {
            answer[1] = 4;
        }
        else if(cnt==2) {
            answer[1]= 5;
        }
        else {
            answer[1] = 6;
        }
        
        return answer;
    }
}
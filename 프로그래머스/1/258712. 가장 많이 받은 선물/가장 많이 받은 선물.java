import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] friend = new int[friends.length][friends.length];
        
        // 주고받은 선물
        for(String s : gifts) {
            String[] gift = s.split(" ");
            //System.out.println(Arrays.asList(friends).indexOf(gift[0]));
            friend[Arrays.asList(friends).indexOf(gift[0])][Arrays.asList(friends).indexOf(gift[1])] += 1;
        }
        /*
        for (int i = 0; i < friend.length; i++) {            
            int[] inArr = friend[i];            
            for (int j = 0; j < inArr.length; j++) {                
                System.out.print(inArr[j] + " ");            
            }            
            System.out.println();
        }
        */
        // 선물 지수
        int[] count = new int[friends.length];
        for(int i=0; i<friends.length; i++) {
            int x = 0; int y = 0;
            for(int j=0; j<friends.length; j++) {
                x += friend[i][j];
                y += friend[j][i];
            }
            count[i] = x - y;
            //System.out.println(count[i]);
        }
        
        for(int m=0; m<friends.length; m++) {
            int cnt = 0;
            for(int n=0; n<friends.length; n++) {
                if(m != n) {
                    if(friend[m][n] > friend[n][m]) {
                        cnt++;
                    }
                    else if(friend[m][n] == friend[n][m]) {
                        if(count[m] > count[n]) {
                            cnt++;
                        }
                    }
                }
            }
            if(cnt > answer) {
                answer = cnt;
            }
        }
        return answer;
    }
}
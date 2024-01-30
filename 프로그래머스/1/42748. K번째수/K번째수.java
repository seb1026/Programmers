import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //System.out.println(commands.length); // 3
        //System.out.println(commands[0][1]); // 3
        
        for(int a=0; a<commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] arr = new int[j-i+1];
            for(int b=0; b<arr.length; b++) {
                if(i<=j) {
                    arr[b] = array[i-1];
                }
                i++;
            }
            Arrays.sort(arr);
            answer[a] = arr[k-1];
            //System.out.println("i:"+i+" j:"+j+" k:"+k);
        }
        
        return answer;
    }
}
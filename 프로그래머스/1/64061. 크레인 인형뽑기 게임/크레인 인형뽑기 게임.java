import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    arrayList.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
//4311324 
        
        while(true) {
            int cnt = 0;
            for(int i=0; i<arrayList.size(); i++) {
                int j = i+1;
                if(j<arrayList.size() && (arrayList.get(i) == arrayList.get(j))) {
                    arrayList.remove(j);
                    arrayList.remove(i);
                    answer += 2;
                    cnt++;
//                    System.out.print("i : "+ i+" j : "+j+'\t');
//                    for(Integer m : arrayList) { //for문을 통한 전체출력
//                        System.out.print(m);
//                    }
                }  
            }
            if(cnt == 0) {
                break;
            }
        }
        
        return answer;
    }
}

//0   0   0   0   0
//0   0   1   0   3
//0   2   5   0   1
//4   2   4   4   2
//3   5   1   3   1
    
//4311324 
//4    
//2
//3    
//1    
//1    
//3    
//4
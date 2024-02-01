import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String s : callings) {
            int rank = map.get(s);
            String front = players[rank-1];
            
            // 앞 -> 뒤 이동
            map.replace(front, rank);
            players[rank] = front;
            
            // 뒤 -> 앞 이동
            map.replace(s, rank-1);
            players[rank-1] = s;
        }
        
        return players;
    }
}
import java.util.*;

class Solution {
    static String[] words = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        dfs("",0);
        int size = list.size();
        
        for(int i=0; i<size; i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }        
        return answer;
    }
    
    static void dfs(String s, int l) {
        list.add(s);
        if(l == 5) {
            //System.out.println("리턴부분 " + s+ " " + l);
            return;
        }
        for(int i=0; i<5; i++) {
            //System.out.println(s+words[i]+ " " + s + words[i]+ " " + l);
            dfs(s+words[i], l+1);
        }
    }
}
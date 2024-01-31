import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : terms) {
            String[] terms_split = s.split(" ");
            map.put(terms_split[0], Integer.parseInt(terms_split[1]));
        }
        
        int date = getDate(today);
        for(int i=0; i<privacies.length; i++) {
            String[] privacies_split = privacies[i].split(" ");
            if(getDate(privacies_split[0]) + (map.get(privacies_split[1])*28) <= date) {
                answer.add(i+1);
            }
        }
        
        return answer;
    }
    
    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
    
}
import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('R',0);        map.put('T',0);        map.put('C',0);
        map.put('F',0);        map.put('J',0);        map.put('M',0);
        map.put('A',0);        map.put('N',0);
        
        // map에 점수넣기
        for(int i=0; i<choices.length; i++) {
            if(choices[i] >= 1 && choices[i] <= 3) {
                char c = survey[i].charAt(0);
                int score = 4 - choices[i];
                map.put(c, map.get(c) + score);
            }
            else if(choices[i] >= 5 && choices[i] <= 7) {
                char c = survey[i].charAt(1);
                int score = choices[i] - 4;
                map.put(c, map.get(c) + score);                
            }
        }
        
        // map 출력
//        for(Character key : map.keySet()) {
//            Integer value = (Integer) map.get(key);
//            System.out.println(key + " : " + value);
//        }
        
        if(map.get('R') >= map.get('T')) {
            answer += "R";
        }
        else { 
            answer += "T";
        }
        
        if(map.get('C') >= map.get('F')) {
            answer += "C";
        }
        else { 
            answer += "F";
        }
        
        if(map.get('J') >= map.get('M')) {
            answer += "J";
        }
        else { 
            answer += "M";
        }
        
        if(map.get('A') >= map.get('N')) {
            answer += "A";
        }
        else { 
            answer += "N";
        }
        
        return answer;
    }
}
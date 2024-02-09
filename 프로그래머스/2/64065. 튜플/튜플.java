import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] split = s.split("\\},\\{");
        int[] answer = new int[split.length];
        
        // 길이 짧은순으로 정렬
        String[][] sortByLength = new String[split.length][];
        for(int i=0; i<split.length; i++) {
            String[] ss = split[i].split(",");
            sortByLength[ss.length-1] = ss;
        }
        
        /*
        for(String[] k : sortByLength)
            System.out.print("["+k+"]");
        */
        
        // set에 없으면 answer에 추가
        HashSet<String> set = new HashSet<String>();
        for (int i=0; i<sortByLength.length; i++) {
            for (int j=0; j<sortByLength[i].length; j++) {
                if (!set.contains(sortByLength[i][j])) {
                    answer[i] = Integer.parseInt(sortByLength[i][j]);
                    set.add(sortByLength[i][j]);
                    break;
                }
            }
        }        
        
        return answer;
    }
}
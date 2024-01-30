import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int sum = 0;
        int answer = 0;
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer x : map.keySet()) {
            arrayList.add(map.get(x));
        }
        arrayList.sort(Collections.reverseOrder());
        
        for(int i : arrayList) {
            answer++;
            sum += i;
            if(sum >= k) {
                break;
            }
        }
        return answer;
    }
}
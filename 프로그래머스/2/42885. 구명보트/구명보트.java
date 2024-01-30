import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(people);
        for(int i=people.length-1; i>=0; i--) {
            arrayList.add(people[i]);
        }
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>(arrayList);
        
        while(!deque.isEmpty()) {
            int sum = deque.peekFirst() + deque.peekLast();
            if(sum > limit) {
                deque.pollFirst();
                answer++;
            } else {
                deque.pollFirst();
                deque.pollLast();
                answer++;
            }
            if(!deque.isEmpty()) {
                if(deque.peekLast() > Math.ceil((double) limit / 2.0)) {
                    break;
                }
            }
        }
        
        if(!deque.isEmpty()) {
            answer += deque.size();
        }
        
        return answer;
    }
}
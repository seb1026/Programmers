import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue_idx = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue_idx.add(i);
            queue.add(priorities[i]);
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(priorities);
        int l = priorities.length - 1;
        
        while(queue.peek() != null) {
            int k = priorities[l];
            int m = queue.poll();
            int n = queue_idx.poll();
            if(k == m) {
                arrayList.add(n);
                l--;
                //System.out.println(n);
            }
            else {
                queue.add(m);
                queue_idx.add(n);
            }
        }
        
        answer = arrayList.indexOf(location) + 1;
        
        return answer;
    }
}
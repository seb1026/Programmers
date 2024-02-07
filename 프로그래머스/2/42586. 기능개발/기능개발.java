import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int rest = 0;
            if((100-progresses[i])%speeds[i]!=0) rest = 1;
            int day = (100-progresses[i])/speeds[i] + rest;
            //System.out.println(day);
            if(i == 0) {
                stack.push(day);
                cnt++;
            }
            else {
                if(stack.peek() < day) {
                    stack.push(day);
                    arrayList.add(cnt);
                    cnt = 1;
                }
                else {
                    cnt++;
                }
            }
        }
        arrayList.add(cnt);
        
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
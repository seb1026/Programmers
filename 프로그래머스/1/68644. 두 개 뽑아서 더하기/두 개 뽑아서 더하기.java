import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        int n = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<=numbers.length-2; i++) {
            for(int j=i+1; j<=numbers.length-1; j++) {
                n = numbers[i] + numbers[j];
                //System.out.print(n);
                if(!arrayList.contains(n)) {
                    arrayList.add(n);
                }
            }
            //System.out.println();
        }
        answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
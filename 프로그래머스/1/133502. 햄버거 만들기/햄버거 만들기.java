import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i : ingredient) {
            arrayList.add(i);
        }    
        // System.out.println(al.size());

        for(int x = 3; x < arrayList.size(); x++){
            if(x >= 3) {
                if(arrayList.get(x) == 1 && 
                   arrayList.get(x - 1) == 3 && 
                   arrayList.get(x - 2) == 2 &&
                   arrayList.get(x - 3) == 1) {
                    arrayList.remove(x);
                    arrayList.remove(x - 1);
                    arrayList.remove(x - 2);
                    arrayList.remove(x - 3);
                    if(x > 0) {
                        x -= 3;
                    }
                    answer++;
                }   
            }
        }
    return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        for(int x = 0; x<cities.length; x++) {
            cities[x] = cities[x].toLowerCase();
        }
        if(cities.length >= cacheSize) {
            for(int i=0; i<cities.length; i++) {
                if(!arrayList.contains(cities[i])) {
                    arrayList.add(cities[i]);
                    answer += 5;
                }
                else {
                    int count = 0;
                    int idx = 0;
                    for(int j=1; j<=cacheSize; j++) {
                        if(arrayList.get(arrayList.size()-j).equals(cities[i])) {
                            count++;
                            idx = arrayList.size()-j;
                            break;
                        }
                    }
                    if(count != 0) {
                        answer += 1;
                        arrayList.remove(idx);
                        arrayList.add(cities[i]);
                    }
                    else {
                        answer += 5;
                        arrayList.add(cities[i]);
                    }
                }
            }
        }
        else {
            for(int i=0; i<cities.length; i++) {
                if(!arrayList.contains(cities[i])) {
                    arrayList.add(cities[i]);
                    answer += 5;
                }
                else {
                    arrayList.add(cities[i]);
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
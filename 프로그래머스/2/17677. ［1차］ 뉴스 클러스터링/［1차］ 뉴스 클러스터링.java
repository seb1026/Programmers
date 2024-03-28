import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> arrayList_str1 = new ArrayList<>();
        ArrayList<String> arrayList_str2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        str1 = str1.toUpperCase(); str2 = str2.toUpperCase();
        for(int i=0; i<str1.length() - 1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i + 1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                arrayList_str1.add(first + "" + second);
            }
        }
        
        for(int i=0; i<str2.length() - 1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i + 1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                arrayList_str2.add(first + "" + second);
            }
        }
        
        Collections.sort(arrayList_str1); Collections.sort(arrayList_str2); 
        for(String s : arrayList_str1) {
            if(arrayList_str2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }
        
        for(String s : arrayList_str2) {
            union.add(s);
        }
        
        double jakard = 1;
        if(union.size() != 0) {
            jakard = (double)intersection.size() / (double)union.size();
        }
        
        answer = (int)(jakard * 65536);
        
        return answer;
    }
}
import java.util.*;
import java.util.Map.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int n = answers.length;
        
        // 1 : 12345
        // 2 : 21232425
        // 3 : 3311224455
        
        int[] ans1 = {1,2,3,4,5};
        int[] ans2 = {2,1,2,3,2,4,2,5};
        int[] ans3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] stu1 = new int[n];
        int[] stu2 = new int[n];
        int[] stu3 = new int[n];

        int cnt = 0;            
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        while(cnt <= n-1) {            
            if(cnt1 == 5) {
                cnt1 = 0;
            }
            
            if(cnt2 == 8) {
                cnt2 = 0;
            }
            
            if(cnt3 == 10) {
                cnt3 = 0;
            }
            
            stu1[cnt] = ans1[cnt1];
            stu2[cnt] = ans2[cnt2];
            stu3[cnt] = ans3[cnt3];
            
            cnt++; cnt1++; cnt2++; cnt3++;
        }
        
        int aa = 0;
        int bb = 0;
        int cc = 0;
        for(int i=0; i<n; i++) {
            if(stu1[i] == answers[i]) {
                aa++;
            }
            if(stu2[i] == answers[i]) {
                bb++;
            }
            if(stu3[i] == answers[i]) {
                cc++;
            }
        }
        
        int[] arr = {aa, bb, cc};
        
        int max = arr[0];
        
        for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        int k = 0;
        for(int i=0; i<arr.length; i++) {
            k++;
            if(arr[i] == max) {
                arrayList.add(k);
            }
        }
        
        answer = new int[arrayList.size()];
        for(int a=0; a<arrayList.size(); a++) {
            answer[a] = arrayList.get(a);
        }
        
        return answer;
    }
}
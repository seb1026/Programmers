class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int date = 0;

        for(int i=0; i<year.length; i++) {
            year[i] = day[(i+5)%7];
        }
        for(int i=0; i<a-1; i++) {
            date += month[i];
        }    
        date += b-1;

        answer = year[date];

        return answer;
    }
}
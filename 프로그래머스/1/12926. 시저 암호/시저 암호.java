class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=' ') {
                int c = arr[i]+n;
                if(arr[i]>='A'&&arr[i]<='Z') {
                    if(c>=65 && c<=90)
                        answer += (char)c;
                    else 
                        answer += (char)(c-26);
                }
                else if(arr[i]>='a'&&arr[i]<='z') {
                    if(c>=97 && c<=122)
                        answer += (char)c;
                    else 
                        answer += (char)(c-26);
                }
            }
            else {
                answer += ' ';
            }
        }
        return answer;
    }
}
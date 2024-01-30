import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String nstr = String.valueOf(n);
        String str = "";
        char[] arr = new char[nstr.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = nstr.charAt(i);
        }
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--) {
            str += arr[i];
        }
        long answer = Long.parseLong(str);
        return answer;
    }
}
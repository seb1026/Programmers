import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] str_conv = new int[str.length];
        for(int i=0; i<str.length; i++) {
            str_conv[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(str_conv);
        String answer = str_conv[0] + " " + str_conv[str_conv.length-1];
        return answer;
    }
}
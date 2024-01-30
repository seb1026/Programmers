class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        
        if(charArr[0] >= 97 && charArr[0] <= 122) {
            charArr[0] -= 32;
        }
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] == ' ' && i != charArr.length-1) {
                if(charArr[i+1] >= 97 && charArr[i+1] <= 122) {
                    charArr[i+1] -= 32;
                }
            }
            answer += charArr[i];
            //System.out.print(charArr[i]);
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        String answer = "";
        String tmp = "";
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                answer += s.charAt(i);
            else {
                tmp += s.charAt(i);
            }
            //System.out.println(tmp);
            if(tmp.equals("zero")) {
                answer += "0";
                tmp = "";
            }
            else if(tmp.equals("one")) {
                answer += "1";
                tmp = "";
            }
            else if(tmp.equals("two")) {
                answer += "2";
                tmp = "";
            }
            else if(tmp.equals("three")) {
                answer += "3";
                tmp = "";
            }
            else if(tmp.equals("four")) {
                answer += "4";
                tmp = "";
            }
            else if(tmp.equals("five")) {
                answer += "5";
                tmp = "";
            }
            else if(tmp.equals("six")) {
                answer += "6";
                tmp = "";
            }
            else if(tmp.equals("seven")) {
                answer += "7";
                tmp = "";
            }
            else if(tmp.equals("eight")) {
                answer += "8";
                tmp = "";
            }
            else if(tmp.equals("nine")) {
                answer += "9";
                tmp = "";
            }
        }
        int num = Integer.parseInt(answer);
        return num;
    }
}
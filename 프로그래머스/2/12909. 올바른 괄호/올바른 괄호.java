class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        int chk = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') { chk++; }
            else { chk--; }
            if(chk < 0) { return false; }
        }
        
        if(chk != 0) return false;

        return answer;
    }
}
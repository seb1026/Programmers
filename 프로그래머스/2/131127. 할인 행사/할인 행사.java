class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i=0; i<discount.length - 9; i++) {
            for(int j=0; j<want.length; j++) {
                int count = 0;
                for(int k=i; k<i+10; k++) {
                    if(discount[k].equals(want[j])) {
                        count++;
                    }
                }
                if(number[j] > count) {
                    break;
                }
                if(j == want.length - 1) {
                    answer++;
                }
            }
            
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int attacks_idx = 0;
        int combo = 0;
        for(int i=1; i<=attacks[attacks.length-1][0]; i++) {
            if(attacks[attacks_idx][0] == i) {
                answer -= attacks[attacks_idx][1];
                combo = 0;
                if(answer <= 0) {
                    return -1;
                }
                attacks_idx++;
                //System.out.println(answer);
            }
            else {
                combo++;
                if(combo != bandage[0]) {
                    answer += bandage[1];
                }
                else {
                    answer += bandage[1] + bandage[2];
                    combo = 0;
                }
                if(answer > health) {
                    answer = health;
                }
                //System.out.println(answer);
            }
        }
        
        return answer;
    }
}
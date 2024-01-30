class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int number = 0;
        while(number<=9) {
            int cnt = 0;
            for(int i=0; i<numbers.length; i++) {
                if(number == numbers[i]) {
                    cnt++;
                }
            }
            if(cnt == 0) {
                answer += number;
            }
            number++;
        }
        
        return answer;
    }
}
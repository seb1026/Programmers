class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftPosition = -1;
        int rightPosition = -1;
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftPosition = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightPosition = numbers[i];
            }
            else {
                leftPosition = leftPosition == -1 ? 10 : leftPosition == 0 ? 11 : leftPosition;
                rightPosition = rightPosition == -1 ? 12 : rightPosition == 0 ? 11 : rightPosition;
                int zeroCheck = numbers[i] == 0 ? 11 : numbers[i];
                int left = recursion(Math.abs(leftPosition - zeroCheck), 0);
                int right = recursion(Math.abs(rightPosition - zeroCheck), 0);
                if(left > right) {
                    answer += "R";
                    rightPosition = numbers[i];
                }
                else if(right > left) {
                    answer += "L";
                    leftPosition = numbers[i];
                }
                else {
                    if(hand.equals("left")) {
                        answer += "L";
                        leftPosition = numbers[i];
                    }
                    else if(hand.equals("right")) {
                        answer += "R";
                        rightPosition = numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
    
    public int recursion(int keypad, int count) {
        if(keypad >= 3) {
            return recursion(keypad-3, count+1);
        }
        else if(keypad >= 1) {
            return recursion(keypad-1, count+1);
        }
        return count;
    }
}
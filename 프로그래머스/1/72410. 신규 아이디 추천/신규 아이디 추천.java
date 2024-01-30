class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        for(int i=0; i<new_id.length(); i++) {
            char ch = new_id.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') {
                answer += String.valueOf(ch);
            }
            else if(ch >= '0' && ch <= '9') {
                answer += String.valueOf(ch);
            }   
            else if(ch == '-' || ch == '_' || ch == '.') {
                answer += String.valueOf(ch);
            }
        }
        
        // 3단계
		for(int i = 0; i < answer.length(); i++) {
			if(answer.charAt(i) == '.') {
				int j = i+1;
				String dot = ".";

				while(j != answer.length() && answer.charAt(j) == '.') {
					dot += ".";
					j++;
				}

				if(dot.length() > 1)
					answer = answer.replace(dot, ".");
			}
		}
        
        // 4단계
        if(answer.startsWith("."))
            answer = answer.substring(1);        
        else if(answer.endsWith("."))
            answer = answer.substring(0, answer.length() - 1);
        
        // 5단계
        if(answer.length() == 0) {
            answer += "a";
        }
        
        // 6단계
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        if(answer.endsWith("."))
            answer = answer.substring(0, answer.length() - 1);
        
        // 7단계
        while(answer.length() <= 2) {
            answer += answer.substring(answer.length() - 1);
        }
        
        return answer;
    }
}
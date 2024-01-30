class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int a = -1;
        int b = -1;
        int c = -1;
        int d = -1;
        
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[i].length(); j++) {
                if(wallpaper[i].substring(j,j+1).equals("#")) {
                    if(a == -1) {
                        a = i;
                    }
                    if(b == -1) {
                        b = j;
                    }
                    else if(b != -1 && b > j) {
                        b = j;
                    }
                    c = i+1;
                    if(d == -1) {
                        d = j+1;
                    }
                    else if(d != -1 && d <= j) {
                        d = j+1;
                    }
                }
            }
        }
        
        answer[0] = a;
        answer[1] = b;
        answer[2] = c;
        answer[3] = d;
        
        return answer;
    }
}
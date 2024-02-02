class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] park2 = new String[park.length][park[0].length()];
        int x = 0; int y = 0;
        
        // 이차원 배열로 변환 park -> park2
        for(int i=0; i<park2.length; i++) {
            for(int j=0; j<park2[0].length; j++) {
                park2[i][j] = park[i].substring(j,j+1);
                if(park[i].substring(j,j+1).equals("S")) {
                    x = i; y = j;
                    //System.out.print(i + " " +y);
                    park2[i][j] = "O";
                }
                //System.out.print(park2[i][j]);
            }
            //System.out.println();
        }
        
        for(String s : routes) {
            String[] route = s.split(" ");
            int n = Integer.parseInt(route[1]);
            if(route[0].equals("E")) {
                if(y+n<park2[0].length) {
                    for(int i=1; i<=n; i++) {
                        if(park2[x][y+i].equals("X"))
                            break;
                        if(i==n) {
                            y = y+n;
                        }
                    }
                }
            }
            else if(route[0].equals("W")) {                
                if(y-n>=0) {
                    for(int i=1; i<=n; i++) {
                        if(park2[x][y-i].equals("X"))
                            break;
                        if(i==n) {
                            y = y-n;
                        }
                    }
                }
            }
            else if(route[0].equals("S")) {
                if(x+n<park2.length) {
                    for(int i=1; i<=n; i++) {
                        if(park2[x+i][y].equals("X"))
                            break;
                        if(i==n) {
                            x = x+n;
                        }
                    }
                }
            }
            else if(route[0].equals("N")) {                
                if(x-n>=0) {
                    for(int i=1; i<=n; i++) {
                        if(park2[x-i][y].equals("X"))
                            break;
                        if(i==n) {
                            x = x-n;
                        }
                    }
                }
            }
            
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
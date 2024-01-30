class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] aa = new String[n];
        String[] bb = new String[n];
        String tmp1 = "";
        String tmp2 = "";
        int k = 0;
        
        for(int i=0; i<arr1.length; i++) {
            k = n;
            while(k>0){
                if((int)Math.pow(2,k-1) <= arr1[i]) {
                    tmp1 += "1";
                    arr1[i] -= (int)Math.pow(2,k-1);
                }
                else {
                    tmp1 += "0";
                }
                if((int)Math.pow(2,k-1) <= arr2[i]) {
                    tmp2 += "1";
                    arr2[i] -= (int)Math.pow(2,k-1);
                }
                else {
                    tmp2 += "0";
                }
                k--;
            }
            aa[i] = tmp1;
            bb[i] = tmp2;
            tmp1 = "";
            tmp2 = "";
        }
        
        //System.out.println("+ : "+aa[1]);
        
        for(int x=0; x<n; x++) {
            tmp1 = aa[x];
            tmp2 = bb[x];
            String map = "";
            for(int y=0; y<tmp1.length(); y++) {
                if(tmp1.substring(y,y+1).equals("0") && tmp2.substring(y,y+1).equals("0")) {
                    map += " ";
                }
                else {
                    map += "#";
                }
            }
            answer[x] = map;
        }
        
        return answer;
    }
}
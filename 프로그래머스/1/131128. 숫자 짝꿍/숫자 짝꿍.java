import java.util.*;

class Solution {
    public String solution(String X, String Y) {

        StringBuilder sb = new StringBuilder();
        
        int[] xArr = new int[10]; // X 숫자별 개수 파악용 배열
        int[] yArr = new int[10]; // X 숫자별 개수 파악용 배열
        
        // 숫자별로 배열 SET
        for(String x : X.split("")){
            xArr[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }
        
        // 마지막(9)부터 반복하면서 둘 다 있는 숫자면 StringBuilder에 append한다.
        for(int i=9; i>=0; i--){
            
            while(xArr[i] > 0 && yArr[i] > 0){
                sb.append(i);
                
                xArr[i]--;
                yArr[i]--;
            }
        }
        
        if("".equals(sb.toString())) return "-1";
        if("0".equals(sb.toString().substring(0,1))) return "0";
        
        return sb.toString();
    }
}
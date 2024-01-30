class Solution {
    public int solution(int n) {
        int answer = 0;
        // 배열 : 자릿수 구하기 cnt
        int k = 1;
        int cnt = 0;
        while(k <= n) {
            cnt++;
            k *= 3;
        }
        
        // cnt길이 배열 생성
        int[] arr = new int[cnt];
        int idx = 0;
        
        //System.out.println(cnt);
        // 3진법 변환
        while(k != 0) {
            if(k / 3 == 0) {
                break;
            }
            k /= 3;
            arr[idx] = n / k;
            n %= k;
            idx++;
        }
        
        //for(int i=0; i<arr.length; i++) {
        //    System.out.print(arr[i]);
        //}
        //System.out.println(k);
        
        // 앞뒤 반전(3진법)
        int[] arr_rev = new int[cnt];
        for(int i=cnt-1; i>=0; i--) {
            arr_rev[i] = arr[cnt-1-i];
        }
        
        //for(int i=0; i<arr_rev.length; i++) {
        //    System.out.print(arr_rev[i]);
        //}
        
        // 10진법으로 표현
        int kk = 1;
        for(int i=arr_rev.length-1; i>=0; i--) {
            answer += arr_rev[i] * kk;
            kk *= 3;
        }
        
        return answer;
    }
}
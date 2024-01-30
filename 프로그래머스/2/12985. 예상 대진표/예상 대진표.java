class Solution
{
    public int solution(int n, int a, int b)
    {
        if(a>b) {
            int tmp = b;
            b = a;
            a = tmp;
        }
        int answer = 1;

        while(true) {
            if(a%2!=0 && b==a+1) {
                break;
            }
            answer++;
            if(a%2==0) a /= 2;
            else a = a/2+1;
            if(b%2==0) b /= 2;
            else b = b/2+1;
        }

        return answer;
    }
}
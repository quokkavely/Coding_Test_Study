class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        
        for(int i = n ; i >= 1 ; i/= 2) {
            if(a > b) {
                if(a-b == 1 && a % 2 == 0) {
                    break;
                }
            } else if(b > a) {
                if(b-a == 1 && b % 2 == 0) {
                    break;
                }
            }
            
            a = a % 2 == 0 ? a/2 : (a+1)/2;
            b = b % 2 == 0 ? b/2 : (b+1)/2;
            
            answer++;
        }

        return answer;
    }
}
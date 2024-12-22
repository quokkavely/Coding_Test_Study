class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n ; i ++) {
            int sum = 0;
            
            if(n % i ==0 && i % 2 ==1 ) answer++;
            
            
            
            // -- 효율성 실패 --
            // for(int j = i; j <= n ;j ++) {
            //     sum += j;
            //     if(sum == n) {
            //         answer++;
            //         break;
            //     }
            // }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        int min = 0;
        int max = 0;
        
        if (m >= n) {
            min = n;
            max = m;
            
        }else {
            min = m;
            max = n; 
        }
        
        answer [0] = gcd(min, max);
        answer [1] = (min * max) / answer[0] ;
          
        
        return answer;
    }
    
    public int gcd (int max, int min) {
        
        if (max % min == 0) {
            return min;
            
        } 
        
        return gcd(min, max % min);
        
    }
}
class Solution {
    public long solution(int n) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 2;
        
        for( long i = 0; i < n; i++) {
            f2 = (f0 + f1) % 1234567;
            f0 = f1;
            f1 = f2;
        }
        
        return f2;
    }

}
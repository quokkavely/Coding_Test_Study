class Solution {
    public int solution(int[] arr) {
        long multiple = 0;
        int gcd = arr[0];
        int lcd = arr[0];
        //최소 공배수 = 두 자연수의 곱 /최대공약수
        for(int i = 1; i < arr.length; i++) {
            multiple = lcd * arr[i];
            gcd = gcd(lcd, arr[i]);
            lcd = (int) multiple/gcd;
        }
        return lcd;
    }
    
    public int gcd(int a, int b) {
        if(b == 0 ) return a;
        
        return gcd(b, a % b);
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        
        //홀수 일때는 짝수병만큼 마신 후 다시 돌려받아서 짝수개로 만들어야 함
        //a개 미만일 때는 못받으니까 주의하기
        
        while (n >= a) {
            
            n = n - a + b;
            answer += b;
            
        }
    
        return answer;
    }
}
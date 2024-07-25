class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
   
        
        do{
            str.append(n % 3);
            n = n / 3;
                
        }while(n > 0);
         
            
        return Integer.parseInt(str.toString(),3);
            
    
    }
}
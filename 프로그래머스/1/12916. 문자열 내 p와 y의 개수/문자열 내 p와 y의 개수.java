class Solution {
    boolean solution(String s) {
       
        
        String str = s.toLowerCase();
        
        int countP = 0;
        int countY = 0;
        
        for(char c : str.toCharArray()){
            if(c=='p'){
                countP++;
            }
            
            if(c=='y'){
                countY++;
            }
        }
        
        
        return countP==countY;
    }
}
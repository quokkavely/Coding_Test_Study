class Solution {
    public String solution(String s) {
        String answer = "";

        
        String[] list = s.split("");
        
        for (int i = 0; i < list.length ; i ++) {
           answer += changeWord(list[i]);
        }
        
        
        return answer;
    }
    
    public String changeWord(String s) {
        String answer = "";
        
        for (int i = 0; j < s.length(); i++) {
            
            if(i % 2 == 0 ) {
              s.charAt(i).toLowerCase();
            
            } else {
                answer += s.charAt(i).toUpperCase();
                
            }
        }
        return answer ;
    }

}
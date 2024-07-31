class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        String[] list = s.split(" ",-1);
        
        for (int i = 0; i < list.length ; i ++) {
       
               answer += changeWord(list[i])+" ";
           
        }
        return answer.substring(0,answer.length()-1);
    }

    
    
    public String changeWord(String s) {
        String answer = "";
        
        if (s.equals(" ")) answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            s.trim();
            
            if(i % 2 != 0 ) {
              answer += String.valueOf(s.charAt(i)).toLowerCase();
            
            } else  {
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                
            }
        }
            
        return answer ;
    }

}
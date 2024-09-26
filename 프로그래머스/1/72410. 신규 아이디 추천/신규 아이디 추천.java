class Solution {
    public String solution(String new_id) {
      
      
        //1. 대문자 > 소문자
        StringBuilder str = new StringBuilder();
        str.append(new_id.toLowerCase());
        
        //2. 소문자, 숫자, 빼기, 밑줄, 마침표 제외 모두 제거
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (!Character.isAlphabetic(c) 
                && !Character.isDigit(c) 
                && c != '-' 
                && c != '_' 
                && c != '.' ) {
                
                str.delete(i, i+1);
                
                //삭제했으면 index 줄어든다
                i--;
    
            }
        }
        
    // 3. 연속된 마침표 수정
        
        for(int i = 0; i < str.length() -1; i++) {
            
            if(str.charAt(i) == '.' && str.charAt(i+1) == '.') {
                str.delete(i, i+1);
                i--;
            }
        }
        
        if (str.length() > 0 && str.charAt(0) == '.' ) {
            str.delete(0, 1);
        }
            
        if (str.length() > 0 && str.charAt(str.length() -1) == '.') {
            str.delete(str.length()-1, str.length());
        }
            
        if (str.toString().isEmpty()) {
            str.append("a");
        }
            
        if (str.length() >= 16) {
            str.delete(15, str.length());
            
            if(str.charAt(str.length() - 1) == '.') {
                str.delete(str.length() - 1, str.length());
            }
        }
        
        
        if (str.toString().length() < 3) {
            String last = Character.toString(str.charAt(str.length()-1));
            str.append(last.repeat(3 - str.length()));
        
        }
             
        return str.toString();
    }   
}
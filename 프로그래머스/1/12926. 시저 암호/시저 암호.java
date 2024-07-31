class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int convert = 0;
        
        for(int i = 0 ; i < s.length() ; i ++) {
           char c = s.charAt(i) ;
           
            
            if (s.charAt(i)==' ') {
                answer += " ";
                continue;
            }
           
            
            if (Character.isUpperCase(c)) {
                convert = c + n;
                if(convert > 90) convert = 64 + (convert - 90);
            } else {
                convert = c + n;
                if (convert > 122) convert = 96 + (convert -122);
            }
            
            answer += Character.toString((char) convert);
            
        }
        
        return answer;
    }
}
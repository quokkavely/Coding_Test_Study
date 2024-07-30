class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        StringBuilder str = new StringBuilder(t);
        
        for (int i = 0 ; i <= t.length() - p.length(); i++ ) {
            
           String subStr =  str.substring(i , i + p.length());
          if( Long.parseLong(subStr) <= Long.parseLong(p)) {
              
              answer ++;
          }
        }
        
        return answer;
    }
}
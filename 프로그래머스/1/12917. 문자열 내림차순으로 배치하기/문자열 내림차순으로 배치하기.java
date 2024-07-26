import java.util.*;

class Solution {
    public String solution(String s) {
       char[] answer = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++ ) {
            answer[i] = s.charAt(i);
        }
        
        Arrays.sort(answer);
        
        return new StringBuilder(new String(answer)).reverse().toString();
     
    }
}
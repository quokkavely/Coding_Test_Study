import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int [s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
    
        for(int i = 0 ; i < s.length(); i++) {
            
            char findWord = s.charAt(i);
            
            if(!map.containsKey(findWord)) {
                answer[i] = -1;
                map.put(findWord,i);
                continue;
                
            } else {
               
                answer[i] = i - map.get(findWord);
                map.put(findWord,i);
                
            }
        }
             
        return answer;
    }
}
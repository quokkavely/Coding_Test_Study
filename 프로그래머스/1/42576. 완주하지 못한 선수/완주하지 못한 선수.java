import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //2중for문 안됨.
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : participant) {
            if(!map.containsKey(name) || map.getOrDefault(name, 0) == 0) {
                return name;
            }
            
            map.put(name, map.get(name) -1);
        }
        
        return answer;
    }
}
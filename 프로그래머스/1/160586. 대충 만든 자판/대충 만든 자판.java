import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++) {
            String str = keymap[i];
            
            for(int j = 0; j < str.length(); j++) {
                char c  = str.charAt(j);
                map.put (c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE),j+1));
            }    
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < targets.length; i++) {
            char[] chars = targets[i].toCharArray();
            int sum = 0;
            boolean isValid = true;

            for(char c : chars) {
                if(map.containsKey(c)) {
                    sum += map.get(c);
                    
                } else {
                    isValid = false;
                    break;
                }
            }
            
            if(isValid) {
                answer.add(sum);
            } else {
                answer.add(-1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
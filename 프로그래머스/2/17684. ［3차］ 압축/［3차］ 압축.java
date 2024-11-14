import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 1; i < 27; i++) {
            char a = (char) (64+i);
            
            map.put(Character.toString(a), i);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < msg.length();) {
            // i = 0 : K , KA, KAK, KAKA, KAKAO
            // i = 1 : A, AK, AKA, AKAO
            // i = 2 : k, KA, KAO
            
            int j = i + 1;
            
            while (j <= msg.length() && map.containsKey(msg.substring(i, j))) {
                j++;
            }
            
            String w = msg.substring(i, j-1);
            list.add(map.get(w));
            
            if (j <= msg.length()) {
                String wc = msg.substring(i, j);
                map.put(wc, map.size() + 1);
            }
            
            i += w.length();
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
         
    }
}
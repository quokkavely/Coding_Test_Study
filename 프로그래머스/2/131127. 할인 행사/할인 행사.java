import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < number.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length -9; i++) {
            
            Map<String, Integer> actual = new HashMap<>(); 
            //10일동안 연속으로 discount 항목과 일치해야함.
            // discount 10개로 끊어서 돈다음 하나라도 일치안하면 중단.
            for(int j = i; j < i + 10 ; j++) {
                if(map.containsKey(discount[j])) {
                    actual.put(discount[j], actual.getOrDefault(discount[j],0) +1);
                }
            
                //만약 동일하다면 answer +1
                if (map.equals(actual)) answer ++;
                
                }
            
        }
        
        return answer;
    }
}
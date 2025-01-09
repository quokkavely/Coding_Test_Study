import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        //서로 다른 종류가 최소 값일 때.
        Map< Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        // 1:1 / 2:2 / 3:2 / 4:1 / 5:2 
        // value 내림차순으로 정렬 필요
    
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for(Integer key : list) {
            k -= map.get(key);
            
            answer++;
            
            if(k <= 0) {
                break;
            }
        }     
        
        return answer;
    }
}
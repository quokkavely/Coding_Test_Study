import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            //같은 이름의 의상은 없기 때문에 List로 의상 이름 저장
            List<String> list = map.getOrDefault(clothes[i][1], new ArrayList<>());
            list.add(clothes[i][0]);
            map.put(clothes[i][1], list);
        }
        
        for(String key : map.keySet()) {
            if(map.size() > 1) {
                answer *= (map.get(key).size()) + 1;
            } else {
                answer += map.get(key).size();
            }
        }
        
        
        return answer -1 ;
    }
}
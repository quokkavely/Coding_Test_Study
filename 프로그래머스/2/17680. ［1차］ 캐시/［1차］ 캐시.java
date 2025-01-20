import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;

        Map<String, String> map = new LinkedHashMap<>(cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> old) {
                return size() > cacheSize; 
            }
        };

        for (String city : cities) {
            //대소문자
            city = city.toLowerCase();

            if (map.containsKey(city)) {
                answer += 1;
            } else {
                answer += 5; 
            }
             map.put(city, city); 
        }
        return answer;
    }
}

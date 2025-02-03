import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        s = s.substring(1, s.length()-1);
        
        String[] arr = s.split(",");
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i ++) {
            // 중괄호 제거 후 저장
            int j = Integer.parseInt(removeS(arr[i]));
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        
        // value 내림차순으로 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) ->  map.get(o2).compareTo(map.get(o1)));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    //중괄호 여부 확인 후 제거
    private String removeS(String s) {
        String answer = "";
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) != '{' && s.charAt(i) != '}') {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}
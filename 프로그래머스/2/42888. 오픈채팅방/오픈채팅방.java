import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
      
        //answer에는 change를 제외한 결과만 담아야 함
        //Leave일때는 id만 나옴
        
        //answer 배열 길이
        int n = 0;
        
        Map<String, String> message = new HashMap<>();
        
        message.put("Enter", "님이 들어왔습니다.");
        message.put("Leave", "님이 나갔습니다.");
        
        //아이디랑 닉네임 담을 map
        Map<String, String> map = new HashMap<>();
        
        for(String str : record) {
            //공백으로 구분
            String[] result = str.split(" ");
            if(result.length == 3) {
                map.put(result[1], result[2]);
            } 
        }
        
        List<String> answer = new ArrayList<>();
    
        for(String str : record) {
            //공백으로 구분
            String[] result = str.split(" ");
            if(message.containsKey(result[0])) {
                answer.add (map.get(result[1]) + message.get(result[0]));
            
            }
        }
        return answer.toArray(new String[0]);
    }
}   
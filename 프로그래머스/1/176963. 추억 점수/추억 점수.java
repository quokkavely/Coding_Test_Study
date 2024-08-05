import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        //Map에 key에 name, value 에 yearning 넣고
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length ; i++) {
            map.put(name[i], yearning[i]);
        }
        
        //for문으로 photo를 돌려서 키에 해당하는 값이있으면 value를 더해서 배열로 반환해주기
        //배열의 크기는 photo의 행의 길이
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length ; i++) {
            for(int j=0; j<photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }
        
        
        return answer;
    }
}
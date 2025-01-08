import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
            
        //단어, 사람 번호
        Map<String, Integer> map = new HashMap<>();
        
        char before = words[0].charAt(0);
        
        for(int i = 0; i < words.length; i++) {
            // map에 단어가 포함되어 있다면 탈락자 발생
            double d = Math.ceil((double) (i + 1) / n);
            if(map.containsKey(words[i]) ) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (int) d;
                break;
                
            } else if( before != words[i].charAt(0)) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (int) d;
                break;
                
            } else {
                map.put(words[i], i+1);
            } 
            
            int leng = words[i].length() -1;  
            before = words[i].charAt(leng);
        }
        return answer;
    }
}
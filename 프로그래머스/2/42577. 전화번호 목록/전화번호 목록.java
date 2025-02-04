import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //길이 기준 정렬 필요        
        Arrays.sort(phone_book, (a, b) -> a.length() - b.length());
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < phone_book.length; i++) {
            String str = phone_book[i];
            set.add(str);
            
            String confirm = "";
            
            for(int j = 0; j < str.length(); j++) {
                confirm = str.substring(0, j);
                if(set.contains(confirm)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}
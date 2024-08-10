import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] str1 = {"aya","ye","woo","ma"};
        String[] str2 = {"ayaaya", "yeye", "woowoo", "mama"};
        
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < babbling.length; i++) {
           for(int j = 0; j < str1.length; j++) {
               
               if(babbling[i].contains(str2[j])) continue;
               else{babbling[i] = babbling[i].replace(str1[j]," ");
                   }
           }    
            
            if(babbling[i].trim().equals("")) answer++;
        }

        
        return answer;
    }
}
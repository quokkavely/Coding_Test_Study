import java.util.*;

class Solution {
    public long solution(long n) {
        
        String answer = "";
        String str = Long.toString(n);
        
        String[] strArr = str.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        for(String a: strArr){
           answer+= a;
        }
        return Long.parseLong(answer); 
       
    }
}
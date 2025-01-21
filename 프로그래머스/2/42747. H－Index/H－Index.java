import java.util.*;
class Solution {
    public int solution(int[] citations) {

        int cnt = 0;
        int n = citations.length;
        
    
        Arrays.sort(citations);
        
        for(int i= n-1; i >= 0; i--) {

            if(n-i <= citations[i]) cnt = n -i;
        }
        
        return cnt;
    }
}
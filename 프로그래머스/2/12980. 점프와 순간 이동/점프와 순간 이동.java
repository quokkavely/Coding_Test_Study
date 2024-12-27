import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i > 0 ;) {
            if(i % 2 == 0) {
                i = i / 2;
            } else {
                i --;
                answer ++;
            }
        }

        return answer;
  
    }
}
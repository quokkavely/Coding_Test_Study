import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 0;
        int zeroCount = 0;
        
        ArrayList<Integer> win = new ArrayList<>();
            for(int i : win_nums) {
                win.add(i);
            }  
        
        for(int i : lottos) {
            if(win.contains(i)) {
                maxCount ++;
            }
            
            if(i==0) {
                zeroCount ++;
            }
        }
        
        answer[0] = 6-maxCount-zeroCount+1;
        answer[1] = 6-maxCount+1;
        
        if( answer[0] == 7 ) {
            answer[0] = 6;
        }
        
        if(answer[1] == 7) {
            answer[1] = 6 ;
        }
        
        return answer;

    }
}
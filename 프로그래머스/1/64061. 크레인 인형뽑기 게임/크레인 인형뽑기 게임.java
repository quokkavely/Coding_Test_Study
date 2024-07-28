import java.util.*;

class Solution {
  public int solution(int[][] board, int[] moves) {
      int count = 0;
        Stack <Integer> list = new Stack<>();

        for(int i = 0; i < moves.length; i++) {

            int idx = moves[i]-1;

            for (int j = 0; j < board.length ; j++ ) {
                
                if (board[j][idx] != 0) {
                    int doll = board[j][idx];
                    board[j][idx] = 0;
                 
                    if (!list.empty() && list.peek() == doll) {
                        list.pop();
                        count += 2;

                    } else {
                        list.push(doll);
                    
                    }
                
                    break;
                }
            }
        }
    
        return count;
    }
}
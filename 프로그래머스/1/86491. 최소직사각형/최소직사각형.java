import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < sizes.length; i ++) {
            
            Arrays.sort(sizes[i]);
            
            if(sizes[i][0] >= maxX ) {
                maxX = sizes[i][0];                
            }
            
            if (sizes[i][1] >= maxY) {
                maxY = sizes[i][1];
            }
        }
    
        
        return maxX * maxY;
    }
}
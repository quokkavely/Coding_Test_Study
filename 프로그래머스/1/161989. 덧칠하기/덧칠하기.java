class Solution {
    public int solution(int n, int m, int[] section) {
    
        int count = 0;
        int before = 0; 
        
        int length = section.length;
        
        for(int s : section) {
            if(s > before) {
                count++;
                before = s + m -1;
            }
        }
        
        return count;
    }

}
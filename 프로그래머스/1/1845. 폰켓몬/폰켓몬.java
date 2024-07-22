import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer,Integer> hash = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) hash.put(nums[i], 1);
        
        return hash.size() > nums.length/2 ? nums.length/2 : hash.size() ;
   
    }
}
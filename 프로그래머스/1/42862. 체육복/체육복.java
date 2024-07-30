import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
   
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int count = n;
        
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();
         
        for (int i : reserve ) {
            reserveSet.add(i);
        }
        
        for (int i : lost) {
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        
        for (int i : lost) {
            if (lostSet.contains(i)) {
                if (reserveSet.contains(i-1)) {
                    reserveSet.remove(i-1);
                } else if(reserveSet.contains(i+1)) {
                    reserveSet.remove(i+1);
                } else {
                    count--;
                }
            }
        }
        return count;
    }
}

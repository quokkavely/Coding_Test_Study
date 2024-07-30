import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // Sort arrays for consistent processing
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // Convert arrays to sets for easy removal
        Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
        Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());

        // Handle students who are both in lost and reserve
        Set<Integer> intersection = new HashSet<>(lostSet);
        intersection.retainAll(reserveSet);
        lostSet.removeAll(intersection);
        reserveSet.removeAll(intersection);

        // Start with the total number of students who can participate
        int answer = n - lostSet.size();

        // Try to lend reserve uniforms to lost students
        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
                answer++;
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
                answer++;
            }
        }

        return answer;
    }
}

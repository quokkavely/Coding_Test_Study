import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
   
        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        int count = 0;

        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> newLostList = new ArrayList<>();

        for (int l : lostList) {
            if (reserveList.contains(l)) {
                reserveList.remove(Integer.valueOf(l));
                count++;
            } else {
                newLostList.add(l);
            }
        }

        for (int l : newLostList) {
            if (reserveList.contains(l - 1)) {
                count++;
                reserveList.remove(Integer.valueOf(l - 1));
            } else if (reserveList.contains(l + 1)) {
                count++;
                reserveList.remove(Integer.valueOf(l + 1));
            }
        }


        return n - lostList.size() + count;
    }
}

import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ; i++) {
            for (int j = 0 ; j <numbers.length ; j++)

                if(i != j ) {
                    list.add(numbers[i] + numbers[j]);
                }
        }
        
        Collections.sort(list);
        return list.stream().distinct().toArray(Integer[]::new);
        

    }
}
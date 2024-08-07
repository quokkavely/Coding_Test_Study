import java.util.* ;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int idx = 0;
        //정렬해서 점수가 높은 상자부터 포장하기
        List<Integer> list =  Arrays.stream(score)
            .boxed().collect(Collectors.toList());
        
        Collections.sort(list, Collections.reverseOrder());
        
        //m개 만큼 잘라서 계산하기
 
        for(int i = 0; i < score.length; i++) {
            list.add(i);
            if(i != 0 && (i+1) % m == 0) {
                answer += list.get(i) * m;
                idx = i+1;
            }
        }

        return answer;
    }
}


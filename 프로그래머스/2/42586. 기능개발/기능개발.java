import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        //남은 작업일 100-progress[i]/speeds[i] 올림처리 필요
        int[] days = new int[speeds.length];
        
        for(int i = 0; i < speeds.length; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
        }
        
        //직전 못나간 작업일
        int max = days[0];
        
        //배포 개수
        int count = 0;
        
        Deque<Integer> answer = new ArrayDeque<>();
     
        for (int i = 0; i < days.length; i++) {
            if(days[i] <= max) {
                count ++;
            } else {
                //직전꺼 넣어주고
                answer.add(count);
                
                //다시계산
                count = 1;
                max = days[i];
            }
        }
    
        answer.add(count);
        
        return answer.stream()
            .mapToInt(Integer::intValue).toArray();
    }
}
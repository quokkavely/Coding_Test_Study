import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        //N 은 전체 스테이지 개수
        //stages는 사용자가 멈춰있는 스테이지 번호
        //실패율 도달못한 플레이어수/스테이지에 도달한 플레이어수
        //실패율이 높은 스테이지부터 내림차순으로 배열 return

        //실패율 key : stage, value : 실패율
        Map <Integer, Integer> countStage = new HashMap<>();


        for (int stage : stages) {
            countStage.put(stage,countStage.getOrDefault(stage,0)+1);
        }

        List <Integer> keys = new ArrayList<>();
        for(int i = 1; i<=N ; i++){
            keys.add(i);
        }
       
        Map<Integer,Double> failPercent = new HashMap<>();
       
        int total = stages.length;
        for(int i = 1; i<=N; i++){
            if(total>0){
                int failPlayer = countStage.getOrDefault(i,0);
                failPercent.put(i,(double) failPlayer/total);
                total-=failPlayer;
            }else{
                failPercent.put(i,0.0);
            }
            
            if(i==N){
                Collections.sort(keys, (o1, o2) -> Double.compare (failPercent.get(o2), failPercent.get(o1) ) );
            }
        }

        int[] answer = new int[N];
        
        for(int i = 0; i < N ; i++) {
            answer[i] = keys.get(i);
        } 

        
        return answer;


    }
}
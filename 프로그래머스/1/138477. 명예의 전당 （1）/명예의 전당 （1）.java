import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
       
        //최저점 배열
        int[] answer = new int[score.length];
        
        //명예의 전당 
        List<Integer> rank = new ArrayList<>();
       
        for(int i =0; i < score.length ; i++) {
            
            rank.add(score[i]);
            Collections.sort(rank);
            
            if(rank.size() > k) {
                rank.remove(0);
                Collections.sort(rank);
            }
            
            answer[i] = rank.get(0);
            
        }
    
        return answer;
    }
}
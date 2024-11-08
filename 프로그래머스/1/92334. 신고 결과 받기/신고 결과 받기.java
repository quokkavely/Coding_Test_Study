import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //신고목록 id > id
        Map<String, Set<String> > reports = new HashMap<>();
        
        //신고횟수 id - 0
        Map<String, Integer> count = new HashMap<>();
        
        
        for(int i = 0 ; i < report.length ; i++ ) {
            String[] arr = report[i].split(" ");
            
            Set<String> list = reports.getOrDefault(arr[0], new HashSet<>());
            boolean b = list.add(arr[1]);
            reports.put(arr[0], list);
            
            if(b) {
                count.put(arr[1], count.getOrDefault(arr[1], 0) + 1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++) {

            //신고한 유저 중 정지된 id 구하기
            
            Set<String> list = reports.get(id_list[i]);
            if(list != null) {
                for(String s : list) {
                    if(count.get(s) >= k) answer[i]++;
                }
            } 
        }
        
        
        return answer;
    }
}
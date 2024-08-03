import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 1) n 을 맨 앞의 문자에 붙이고 2) 정렬 후 3) n을 제거하기
       
        // 1) n을 붙이기
        String[] arr = new String[strings.length];
        
        for(int i = 0; i< strings.length ; i++) {
            arr[i] = strings[i].charAt(n) + strings[i];
        }
        
        // 2) 정렬
        Arrays.sort(arr);
        
        
        // 3) 앞에 붙인 n제거하고 answer에 담아서 리턴.
        String[]answer = new String[arr.length];
        
        for (int i = 0; i< arr.length; i++) {
           answer[i] = arr[i].substring(1,arr[i].length());
        }
        
        return answer;
    }
}
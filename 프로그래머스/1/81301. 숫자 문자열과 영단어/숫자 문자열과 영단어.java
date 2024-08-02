import java.util.*;

class Solution {
    public int solution(String s) {
        int idx = 0;
        
        //contains 메서드를 사용하기 위해 map 사용 
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map <String, Integer> map = new HashMap<>();
        
        for(int i =0 ; i < arr.length ; i++) {
            map.put(arr[i], i);            
        }
        
        String str = "";
        StringBuilder sb = new StringBuilder(s);
        
        //s를 순회해서 숫자면 continue, string이면 잘라서 일치하는지 확인하기,
        for(int i =0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                str += Character.getNumericValue(s.charAt(i)); 
                idx = i + 1; // 4일때 i = 3, idx =4 로 반영.
                continue;
                
                //만약 seven이 들어오게되면 i=8, idx = 4  true 이므로 idx = 9
            } else {
                
                    if(map.containsKey(sb.substring(idx,i+1))) {
                        str += map.get(sb.substring(idx,i+1));
                        idx = i + 1 ; 
                    }
                }
            }
        
             
        return Integer.parseInt(str);
    }
}
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<Character,Character> map = new HashMap<>();
        //닫힌 괄호 보면 열린괄호를 찾을 수 있어야 함.
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        //길이만큼 회전하므로 이어서 붙이기
        s += s;
        
       A: for(int i = 0; i < s.length()/2; i++) {
            Stack<Character> stack = new Stack<>();
            for(int j = i; j < i + s.length()/2; j++) {
                char c = s.charAt(j);
                
                if (!map.containsKey(c)) {
                    stack.push(c); 
                } else {
                    if(stack.isEmpty() || !stack.pop().equals(map.get(c)))
                        continue A;                                        
                }
                
            }
           if(stack.isEmpty()) answer++;
        }
    
        
        return answer;
    }
}
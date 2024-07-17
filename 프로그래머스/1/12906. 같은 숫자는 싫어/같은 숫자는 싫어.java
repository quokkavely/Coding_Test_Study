import java.util.*;

public class Solution {
    public Stack solution(int [] arr) {
        
        
        Stack answer = new Stack<>();
        
        if(arr.length<=1){
            return answer;
        }
        
        int beforeNumber = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(i==0){
                answer.push(arr[i]);
                continue;
            }
            
           int currentNumber = (int) answer.push(arr[i]);
            if(currentNumber == arr[beforeNumber]){
                answer.pop();
            }
             beforeNumber++;
        }
        
        return answer;
    }
}
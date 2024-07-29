import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Map <String, Integer> map = new HashMap<>();
            map.put("L", 10);
            map.put("R", 12);
        
        for(int number : numbers) {
            if(number == 0) number = 11;
        
            
            if(number % 3 == 0 && number != 0 ) {
                map.put("R", number);
                answer += "R";
                
            } else if(number % 3 == 1 ) {
                map.put("L", number);
                answer+= "L";
            
            } else {
                
                int leftDiff = clickCenter(map.get("L"), number);
                int rightDiff = clickCenter(map.get("R"), number);
                
                if(leftDiff > rightDiff ) {
                    map.put("R", number);
                    answer += "R";
                
                } else if(leftDiff < rightDiff) {
                    
                    map.put("L", number);
                    answer+= "L";
             
                } else {
                        if (hand.equals("right")) {
                        map.put("R", number);
                        answer += "R";
                            
                    } else {
                       
                        map.put("L", number);
                        answer += "L";
                    }
                }
            }
        }
            
            return answer;
            
        }
    
        
        public static int clickCenter(int previousKey, int currentKey) {
   

            int fromX = (previousKey - 1) / 3;
            int fromY = (previousKey - 1) % 3;
            int toX = (currentKey - 1) / 3;
            int toY = (currentKey - 1) % 3;

            return Math.abs(fromX - toX) + Math.abs(fromY - toY);
        }
    
 }

class Solution {
    public int solution(int[] numbers) {
         int answer = 0;
        String numStr ="";
        String str = "0123456789";
        
        for(int number : numbers){
           String num = Integer.toString(number);
           numStr+=num;
        }
        
        for(char c: str.toCharArray()){
            if(numStr.indexOf(c)==-1){
               int notFound = Character.getNumericValue(c);
               answer+=notFound;
            }
        }
        
        return answer;
    }
}
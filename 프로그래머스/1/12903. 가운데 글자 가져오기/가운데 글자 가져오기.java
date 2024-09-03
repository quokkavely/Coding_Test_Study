class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder str = new StringBuilder(s);
        
        int length = s.length();
        if(length % 2 == 0){
            answer = str.substring((length/2)-1,(length/2)+1);
        }else{
            answer = str.substring((length/2),(length/2)+1);
        }
        
        return answer;
    }
}
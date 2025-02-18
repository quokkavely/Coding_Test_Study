class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(char c : my_string.toCharArray()) {
            String s = c +"";
            if(!s.equals(letter)) answer += s; 
        }
        return answer;
    }
}
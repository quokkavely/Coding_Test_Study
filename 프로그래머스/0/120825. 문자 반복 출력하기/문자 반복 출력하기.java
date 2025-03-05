class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(char c : my_string.toCharArray()) {
           String s = c +"";
            answer+= s.repeat(n);
        }
        return answer;
    }
}
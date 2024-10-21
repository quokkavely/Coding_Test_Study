class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length();  i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) { //대문자라면
               answer += Character.toLowerCase(c);
            } else { //소문자라면
               answer += Character.toUpperCase(c);
            }
        }
        
        return answer;
    }
}
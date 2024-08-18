class Solution {
    public String solution(String s, String skip, int index) {
               String abc = "abcdefghijklmnopqrstuvwxyz";
        
 
        for (char ch : skip.toCharArray()) {
            abc = abc.replace(String.valueOf(ch), "");
        }
        

        StringBuilder result = new StringBuilder();
        
       
        for (char ch : s.toCharArray()) {
            int current = abc.indexOf(ch);
            int newPos = (current + index) % abc.length();
            result.append(abc.charAt(newPos));
        }
        
        return result.toString();
    }
}
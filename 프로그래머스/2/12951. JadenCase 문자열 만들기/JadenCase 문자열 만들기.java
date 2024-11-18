class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] strArr = s.split(" ");
        
        for (String str : strArr) {
            if(!str.isEmpty()) {
                char c = str.charAt(0);
            
                if(Character.isLetter(c)) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(c);
                }

                answer.append(str.substring(1).toLowerCase());
            }
            
            answer.append(" ");
        }
        
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer.toString();
        
        return answer.toString().substring(0, answer.length()-1);
    }
}
class Solution {
    public  boolean solution(String s) {
            if(s.length() != 4 && s.length() != 6) {
                return false;
            }

            String number = "012345789";

            for(char c : s.toCharArray()) {
                if(number.indexOf(c) == -1){
                    return false;
                }
            }


            return true;
        }
}
class Solution {
    public String solution(String phone_number) {        
       
        int length = phone_number.length();
        
        StringBuilder str = new StringBuilder(phone_number);
        
        
        str.replace(0,length-4,"*".repeat(length-4));
        
        
        return str.toString();
    }
}
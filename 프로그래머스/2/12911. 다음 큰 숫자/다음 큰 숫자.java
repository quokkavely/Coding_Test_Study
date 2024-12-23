class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s1 = Integer.toBinaryString(n);
        int count1 = countOne(s1);
        
        for(int i = n + 1; i < Integer.MAX_VALUE ; i++) {
            String s2 =  Integer.toBinaryString(i);
            int count2 = countOne(s2);
            if(count1 == count2) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    private int countOne (String s) {
        int count = 0;
        
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '1') count++;
        }
        
        return count;
    }
}
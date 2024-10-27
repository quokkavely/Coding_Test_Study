class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // ( 로 시작하는지 확인 후 (개수랑 )개수랑 일치하는지 확인

        int left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else {
                left --;
                if (left < 0) return false;
            }
        }
        
        return left == 0;
    }
}
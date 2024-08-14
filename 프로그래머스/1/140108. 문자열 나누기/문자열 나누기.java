class Solution {
    public int solution(String s) {
        int answer = 0;
         //s의 첫문자를 저장하고 동일한 첫 문자가 나올 경우 acount +1
        // 아닌 문자에 대해서 또 bcount +1 한다.
        // acount == bcount 일 경우
        // 문자를 slice 한 후
        //위 과정을 반복
        // 읽은 문자열이 없을 경우 종료 후 slice 된 횟수를 반환.

        int acount = 0;
        int bcount = 0;
        char c = s.charAt(0);
        
        for(int i =0; i < s.length(); i++) {
            
            if(c == s.charAt(i)) acount ++;
            else {
                bcount ++;
                 }
            
            if(acount == bcount) {
                answer++;
                if (i + 1 < s.length()) {
                    c = s.charAt(i + 1);
                }
                acount = 0;
                bcount = 0;
            }   
        }
        
        if (acount != 0 || bcount != 0) {
            answer++;
        }
        
        
        return answer;
    }
    

}
class Solution {
    public int[] solution(String s) {
        int number = 0; // 제거한 0 개수
        int degree = 0; // 횟수
        
        while (!s.equals("1")) {
            int zeroCount = 0; 
            
            // 0 제거 및 길이 계산
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroCount++;
                }
            }
            
            number += zeroCount;
            s = Integer.toBinaryString(s.length() - zeroCount);
            degree++;
        }
        
        return new int[] {degree, number};
    }

}
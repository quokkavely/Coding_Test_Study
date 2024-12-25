class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
            
        int total = brown + yellow;
        // x 가로 y 세로
        for(int y = 3; y <= total / y ; y++) {
            if(total % y == 0) {
                int x = total / y;
                
                if((x - 2) * (y - 2) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                }
            }
        }
    
        return answer;
    }
}
class Solution {
    public int[] solution(int n, long left, long right) {
        int leng = (int)(right - left) + 1;
        int[] answer = new int[leng];
        
        for (int i = 0; i < leng; i++) {
            long index = left + i; 
            int x = (int)(index / n);
            int y = (int)(index % n);
            
            answer[i] = Math.max(x, y) + 1;
        }
        
        return answer;
    }
}
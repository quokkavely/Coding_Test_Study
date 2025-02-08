class Solution {
    static int leng;

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        String current = board[h][w];
        leng = board.length;
        // 유효한 위치인지 확인 : [h-1][w] , [h+1][w] , [h][w-1] , [h-1][w+1] 
        // 유효한 위치가 아니면 색깔 확인 안해도 됨.
        if(isValidLoc(h-1, w)) {
            if(board[h-1][w].equals(current)) answer++;
        }

        if(isValidLoc(h+1, w)) {
            if(board[h+1][w].equals(current))  answer++;
        }

        if(isValidLoc(h, w-1)) {
            if(board[h][w-1].equals(current))  answer++;
        }

        if(isValidLoc(h, w+1)) {
            if(board[h][w+1].equals(current))  answer++;
        }

        return answer;
    }

    private boolean isValidLoc(int h, int w) {
        return h >= 0 && w >= 0 && h < leng && w < leng;
    }
}
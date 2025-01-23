class Solution {
    private int answer;
    private boolean[] visited;
    private int[][] dg;
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        dg = dungeons;
        
        visited = new boolean[dungeons.length];
        backtrack(k, 0);
        
        return answer;
    }
    
    private void backtrack(int k, int cnt) {
        for(int i = 0; i < dg.length; i ++) {
            //방문한적 없고,
            // 현재 피로도가 최소 필요피로도보다 크거나 같으면
            if(!visited[i] && k >= dg[i][0]) {
                visited[i] = true;
                backtrack(k-dg[i][1], cnt +1);
                answer = Math.max(answer, cnt+1);
                visited[i] = false; // 방문취소
            }
        }
    }
}
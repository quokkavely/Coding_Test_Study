class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        //행열의 길이
        int row1 = arr1.length;
        int column1 =arr1[0].length;
        
        int row2 = arr2.length;
        int column2 = arr2[0].length;
       
        int[][] answer = new int[row1][column2];
       
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        

        return answer;
    }
}
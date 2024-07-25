import java.util.Arrays;

class Solution {
    

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int l = 0; l < commands.length; l++) {
            answer[l] = arrayCutAndSort(array, commands, l);
        }
        
        return answer;
    }
    
   
    
    public int arrayCutAndSort(int[] arr1, int[][] arr2, int l) {

        int i = arr2[l][0]-1;
        int j = arr2[l][1];
        int k = arr2[l][2]-1;
        int idx = 0;

        int[] answer = new int[j-i];

        for(int n = i ; n < j ; n++ ) {

            answer[idx] = arr1[n];
            idx ++;

        }
        Arrays.sort(answer);
        return answer[k];
    }
        
    
}
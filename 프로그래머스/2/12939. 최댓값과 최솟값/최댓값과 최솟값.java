import java.util.Arrays;
class Solution {
    public String solution(String s) {
                    
        String[] arr = s.split(" ");
        int[]numArr= new int[arr.length];
        for(int i=0; i<arr.length;i++){
           numArr[i]=Integer.parseInt(arr[i]);
        }
       
        
        Arrays.sort(numArr);
        return numArr[0]+" "+numArr[arr.length-1];
    
    
    }
}
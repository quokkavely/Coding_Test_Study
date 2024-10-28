import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        //각 배열의 최솟값과 최대값을 구해서 꺼내서 비교한 다음 최솟값과 최댓값을 곱하게 해서 더하게 해야함
        
        //1234  5678 
        //그럼 정렬을 한 다음에 비교해서 꺼내기
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0 ; i < A.length; i++) {
           answer += A[i] * B[A.length-1-i];
        } 
        
        
        return answer;
    }
}
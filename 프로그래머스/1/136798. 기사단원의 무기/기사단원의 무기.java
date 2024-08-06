class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] arr = new int[number];
        
        // 약수 계산
        for(int i = 1 ; i <= number ; i++) { 
            int count = 0;    
            for (int j = 1 ; j * j <= i ; j++) {
                if(i % j == 0) { 
                    count++;
                    if (j != i / j) {
                         count ++;
                    }
                }
            }
            
            arr[i-1] = count;
            
            //limit 넘는 것은 Power로 대체하기
            if (arr[i-1] > limit) {
                arr[i-1] = power;
            }
            answer += arr[i-1];
            
        }

  
        return answer ;
    }
}

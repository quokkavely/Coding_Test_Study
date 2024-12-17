class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int longw = Math.max(wallet[0], wallet[1]);   //30
        int shortw = Math.min(wallet[0], wallet[1]); //15
        int longb = Math.max(bill[0], bill[1]); //26
        int shortb = Math.min(bill[0], bill[1]);  //17 
        
        //지폐가 더 크면 반복해서 접기  shortw =15, longw= 30
        while(shortb > shortw || longb > longw) {
            //길이가 긴 쪽 반 접기
            if (longb > longw ) {
                longb /= 2;
                answer++; // longb = 13, shortb = 17  
              //90도 회전시 들어가는면 탈출  
            } else if (shortb > shortw) {
                longb /= 2;
                answer++;
            }
            
            if(longb < shortw && shortb < longw) { 
                break;
            }
            
            int a = longb;
            int b = shortb;
            longb = Math.max(a, b);
            shortb = Math.min(a, b);
        }
        return answer;
    }
}
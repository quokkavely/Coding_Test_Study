class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;
        
        for(int i = 1 ; i <= count ; i++){
            totalMoney += i*price;
        }

        long answer =  (long)totalMoney - money ;
        
        return answer >=0 ?  answer : 0;
    }
}
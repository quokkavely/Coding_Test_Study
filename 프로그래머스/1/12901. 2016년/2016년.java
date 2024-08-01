class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1 월 31일  2월 29일  3월 31일  4월 30일 5월 31일 6월 30일 7월 31일 8월 31일 9월 30일 10월 31일 11월 30일 12월 31일
        String [] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int day = calculateDay(a,b);
        
        //만약 14일 뒤로 계산하면
        for(int i = 0; i < days.length; i++) {
            if(day % 7 == i ) answer = days[i];
        }
        
       return answer; 
    }
    
    
    //1월 1일 이후의 날짜 수를 계산
    private int calculateDay(int a, int b) {
        
        int [] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        
        for(int i = 0 ; i < a-1 ; i++) {
            sum += daysOfMonth[i];
        }
        
        return sum + b - 1;
    }
}
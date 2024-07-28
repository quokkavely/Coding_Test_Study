class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum=0;
        
        for(char ch : Integer.toString(x).toCharArray()){
            sum+=ch-'0';
            
        }
        if(x%sum==0){
            return true;
        }
        
        return answer;
    }
}
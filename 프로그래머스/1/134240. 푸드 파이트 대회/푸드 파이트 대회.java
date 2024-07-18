class Solution {
    public String solution(int[] food) {
        String answer="";
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        for(int i = 1; i < food.length ; i++){
            String str =Integer.toString(i);
            front.append(str.repeat(food[i]/2));
        }
        
        back.append(front.toString());
        back.reverse();
        answer = front.toString() + "0" + back.toString();
        return answer;
    }
}
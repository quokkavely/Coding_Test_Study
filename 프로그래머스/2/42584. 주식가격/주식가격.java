import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        // 각 초마다 가격이 떨어지지 않는 기간 계산
        for (int i = 0; i < prices.length; i++) {
            // 스택에 있는 인덱스들의 가격보다 현재 가격이 낮으면 기간 계산
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx; 
            }
            stack.push(i); 
        }
        
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
        }
        
        return answer;
    }
}

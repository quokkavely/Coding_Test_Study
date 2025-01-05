import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;


        Arrays.sort(people);

        int i = 0; // 가장 가벼운 사람
        int j = people.length - 1; // 가장 무거운 사람

        while (i <= j) {
            // 가장 가벼운 사람과 가장 무거운 사람 
            if (people[i] + people[j] <= limit) {
                i++; 
            }
            
            j--;
            answer++;
        }

        return answer;
    }
}
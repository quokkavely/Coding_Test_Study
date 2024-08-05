
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    
        int i = 0;
        int j = 0;
        
        //goal의 총 길이를 돌아서 card1 과 card2가 단어를 가지고 잇는지 확인하기.
        for(String str : goal) {
            if(i < cards1.length && str.equals(cards1[i])) {
                i++;
                continue;
            } else if(j < cards2.length && str.equals(cards2[j])) {
                j++;
                continue;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
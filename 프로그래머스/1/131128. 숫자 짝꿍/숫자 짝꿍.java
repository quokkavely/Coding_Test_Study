import java.util.*;

public class Solution {
    public String solution(String X, String Y) {

        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }
        
        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }
        
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(xCount[i], yCount[i]);
            if (commonCount > 0) {
                char[] chars = new char[commonCount];
                Arrays.fill(chars, (char) (i + '0'));
                result.append(chars);
            }
        }
        
        // 결과가 빈 경우
        if (result.length() == 0) {
            return "-1";
        }
        
        // 결과가 0
        if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result.toString();
    }
}
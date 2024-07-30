import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String resultA = "";
        for(int i = 0; i < a; i++){
            resultA += "*";
        }
        
        String resultB = "";
        for(int i = 0; i < b; i++) {
           resultB = resultA + "%n" + resultB;
            
        }
         
        System.out.printf(resultB);
    }
}
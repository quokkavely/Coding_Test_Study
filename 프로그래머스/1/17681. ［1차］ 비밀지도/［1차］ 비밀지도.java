class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
       String[] answer1 = intToBinary(n, arr1);
       String[] answer2 = intToBinary(n, arr2);
       
        
        for(int i = 0; i < n ; i++) {
             String str = "";
            for(int j =0 ; j < n ; j++) {
            if(answer1[i].charAt(j) == '1' || answer2[i].charAt(j) == '1' ) {
                str += "#";
            } else {
                str+=" ";
            }
        }
            answer[i] = str;
        }
        
        return answer;
    }
    
        public String[] intToBinary(int n, int [] arr) {
            String answer[] = new String[n];
            
                for(int i =0; i < n ;i++) {
                
                String back = Integer.toBinaryString(arr[i]);
                String front = "";
                
                if(back.length() < n) {
                    front = "0".repeat(n-back.length());
                }
                    answer[i] = front + back;
            }
            return answer;
        }
        
    
}

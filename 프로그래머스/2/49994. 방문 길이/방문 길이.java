import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        //이동한 좌표를 기록해야 함
        int x= 0;
        int y= 0;

        Set<String> loc = new HashSet<>();
    
        
        for(int i = 0; i < dirs.length(); i ++) {
            char d = dirs.charAt(i);
            
            //이동 후 위치
            int mx = x;
            int my = y;
            
            //left 일때는 x가 -1, right 일때는 +1
            //up 일때는 y가 +1, down 일때는 -1
        
            switch (d) {
                case 'U': my ++; break;
                case 'D': my --; break;
                case 'L': mx --; break;
                case 'R': mx ++; break;
            }
            
            //좌표 벗어나는지 check 필요
            if (mx < -5  || mx > 5 || my < -5 || my > 5 ) {
                continue;
            }
            
            // 이동 경로 확인, 지나간 거리는 중복 안됨. 거꾸로도 확인해야햠
            String location1 = x + "," + y + ">" + mx + "," + my;
            String location2 =  mx + "," + my + ">" + x + "," + y;
            
            if(!loc.contains(location1) && !loc.contains(location2)) {
                loc.add(location1);
                loc.add(location2);
                answer ++;
            }
            
           
            x = mx;
            y = my;
        }
    
        
        return answer;
    }
    
}
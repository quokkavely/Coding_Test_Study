import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //key에 장르, value에 총 play수 
        Map<String, Integer> playCount = new HashMap<>();
        
        //장르별로 idx랑 play수 담기
        Map<String, List<Song>> bestGenres = new HashMap<>();
        
        for(int i = 0; i < genres.length ; i++) {
            playCount.put(genres[i], playCount.getOrDefault(genres[i], 0) + plays[i]);
            
            //해당 장르에 list 조회, 장르 없으면 새 list
            List<Song> songs = bestGenres.getOrDefault(genres[i], new ArrayList<>());
            songs.add(new Song (i, plays[i]));
            
            bestGenres.put(genres[i], songs);
            
        }
        
        //정렬 후 2곡씩 담기
        for(String s : bestGenres.keySet()) {
            List<Song> songs = bestGenres.get(s);
            
            //역순으로 정렬
            songs.sort((a,b) ->  b.play - a.play == 0 ? a.idx - b.idx : b.play - a.play);
            
            if (songs.size() > 2) {
                bestGenres.put(s, songs.subList(0, 2));
            }
        }
        
        //전체장르 정렬
        List<String> genreList  = new ArrayList<>(playCount.keySet());
        genreList.sort((a,b) -> playCount.get(b) - playCount.get(a));
        
        List<Integer> answer = new ArrayList<>();
        for (String s : genreList) {
            List<Song> songs = bestGenres.get(s);
            
            for(Song song : songs) {
                answer.add(song.idx);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
    
    private class Song {
        int idx;
        int play;
        
        Song(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }
}
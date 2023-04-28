package org.howard.edu.lsp.exam.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase{
    private final Map<String, Set<String>> map = new HashMap<>();

    public void addSong(String genre, String song){
        //if the genre is contained in the key set of Map
        try {
            //then add the song associated to the given genre
            map.get(genre).add(song);
        }catch (Exception e){
            //otherwise add a new key as the given genre and place the song in that Set
            map.put(genre,new HashSet<>());
            map.get(genre).add(song);
        }

    }

    public String getGenreOfSong(String songTitle) {
        String out = null;
        //traversing the key set
        for (String key : map.keySet()) {
            //in each key set finding the songTitle
            //if it is found then return the key which will
            //be the genre of the song
            if(map.get(key).contains(songTitle))
                return key;
        }
        return out;
    }

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
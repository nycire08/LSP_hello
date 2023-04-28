package org.howard.edu.lsp.exam.problem;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
public class SongsDatabaseTest {

    private String name;
    private List<Song> songs;

    public void Genre(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }   
    public List<Song> getSongs() {
        return songs;
    }

 @Test 
  public static List<Genre> getGenre(String songName) {
        for (SongsDatabase song : songs) {
            if (song.getName().equals(songName)) {
                return genre
            }
        }
        return new ArrayList(); //Return empty list if no genre found for a given name
   

 private static List<Genre> genres = new ArrayList<>();
 

    public static List<Song> getSongs(String genreName) {
        for (SongsDatabase genre : genres) {
            if (genre.getName().equals(genreName)) {
                return genre.getSongs();
            }
        }
        return new ArrayList(); //Return empty list if no songs found for a given name
    }
   public static void add(Song song, String genreName) {
    for (Genre genre : genres) {
        if (genre.getName().equals(genreName)) {
            genre.getSongs().add(song);
            return;
        }
    }
    //If no genre was found (return would have been called), create a new one
    Genre genre = new Genre(genreName);
    genre.getSongs().add(song);
    genres.add(genre);

}
}

SongsDatabase db = new SongsDatabase();
db.add(“Rap”, “Savage”);
db.add(“Rap”, “Gin and Juice”);
db.add(“Jazz”, “Always There”);
Set songs = db.getSongs(“Rap”);
System.out.println( db.getGenreOfSong(“Savage”) );
assertEquals("Rap",str)
System.out.println( db.getGenreOfSong(“Always There”) );
assertEquals("Jazz",str)
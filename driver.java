package org.howard.edu.lsp.exam.problem;

public class driver {
    public static void main(String[] args) {
        SongsDatabase songsDatabase =  new SongsDatabase();
        //adding the genres and the songs to the database using the methods
        songsDatabase.addSong("Pop","Billie Jean");
        songsDatabase.addSong("Pop","Thriller");
        songsDatabase.addSong("Pop","Beat it");
        songsDatabase.addSong("Rock","Numb");
        songsDatabase.addSong("Rock","In the end");
        songsDatabase.addSong("Metal","Nothing else matters");

        //displaying the genres of the song
        System.out.println("Genre of the song Billie Jean : "+songsDatabase.getGenreOfSong("Billie Jean"));
        System.out.println("Genre of the song Nothing else matters : "+songsDatabase.getGenreOfSong("Nothing else matters"));
        System.out.println("Genre of the song In the end : "+songsDatabase.getGenreOfSong("In the end"));
        System.out.println("Genre of the song One step closer : "+songsDatabase.getGenreOfSong("One step closer"));
    }
}

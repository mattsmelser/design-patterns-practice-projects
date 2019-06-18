package model;

import java.util.LinkedList;

public class iPod {

    private String name;
    private String movie;
    private String photo;
    private String song;

    LinkedList<String> songs = new LinkedList<>();
    LinkedList<String> movies = new LinkedList<>();
    LinkedList<String> photos = new LinkedList<>();

    // TODO: add fields here which represent this iPod's Movies, Photos, and Songs, they should be of the Collection type

    public iPod(String name) {
        this.name = name;
        this.movie = movie;
        this.photo = photo;
        this.song = song;
    }

    // getters
    public String getName() { return name; }

    public String getMovie() {return movie;}

    public String getPhoto() {return photo;}

    public String getSong() {return song;}

}
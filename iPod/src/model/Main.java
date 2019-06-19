package model;


import model.media.AbstractMedia;
import model.media.*;

public class Main {

    public static void main(String[] args) {
        iPod nano = new iPod("John");
        Movie m1 = new Movie("Dunkirk (2017)", "Christopher Nolan", "Drama",  107);
        Movie m2 = new Movie("The Dark Knight (2008)", "Christopher Nolan", "Action",  107);
        Movie m3 = new Movie("The Matrix (1999)", "The Wachowski Brothers", "Action",  107);
        Song s1 = new Song("Writing's on the Wall", "Sam Smith", "Ballad", 3.02);
        Song s2 = new Song("The Entertainer", "Billy Joel", "Ballad", 3.02);
        Song s3 = new Song("American Pie", "Don McLean", "Ballad", 7.02);
        Photo p1 = new Photo("Moonrise", "Ansel Adams", "Landscape", "Yosemite");
        Photo p2 = new Photo("Sunset", "Jacob Smith", "Landscape", "Hawaii");
        Photo p3 = new Photo("Earthrise", "Niel Armstrong", "Landscape", "Moon");



       // TODO: add the static objects you've declared before this method to the iPod (nano)
        nano.addMovie(m1);
        nano.addMovie(m2);
        nano.addMovie(m3);
        nano.addSong(s1);
        nano.addSong(s2);
        nano.addSong(s3);
        nano.addPhoto(p1);
        nano.addPhoto(p2);
        nano.addPhoto(p3);


        System.out.println(nano.getName() +"'s iPod contains: ");
        // TODO: Use the Iterator Design Pattern to make the following for-each loop run
        for (AbstractMedia m : nano) {
            System.out.println(m.getName() + " by: " + m.getCreator());
        }
    }


}
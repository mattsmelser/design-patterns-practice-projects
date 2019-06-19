package model;

import model.media.AbstractMedia;
import model.media.Movie;
import model.media.Photo;
import model.media.Song;
import java.util.*;

public class iPod implements Iterable<AbstractMedia>{

    private String name;
    private Set<AbstractMedia> songs = new HashSet<>();
    private Set<AbstractMedia> movies = new HashSet<>();
    private Collection<AbstractMedia> photos = new HashSet<>();


    // TODO: add fields here which represent this iPod's Movies, Photos, and Songs, they should be of the Collection type

    public iPod(String name) {
        this.name = name;
    }

    // getters
    public String getName() { return name; }

    public void addMovie(Movie m){movies.add(m);}
    public void addSong(Song s){songs.add(s);}
    public void addPhoto(Photo p){photos.add(p);}

    @Override
    public Iterator<AbstractMedia> iterator(){
        return new AbstractMediaIterator();
    }

    private class AbstractMediaIterator implements Iterator<AbstractMedia>{
        Iterator movieIterator = movies.iterator();
        Iterator photoIterator = photos.iterator();
        Iterator songIterator = songs.iterator();

        @Override
        public boolean hasNext(){
            return movieIterator.hasNext()||photoIterator.hasNext()||songIterator.hasNext();
        }

        @Override
        public AbstractMedia next(){
            AbstractMedia m = null;
            if (movieIterator.hasNext()){
                m = (Movie) movieIterator.next();
            } else if (photoIterator.hasNext()){
                m = (Photo) photoIterator.next();
            }else if (songIterator.hasNext()){
                m = (Song) songIterator.next();
            }
            return m;
        }
    }

}
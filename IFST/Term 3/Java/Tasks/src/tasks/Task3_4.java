package tasks;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;

public class Task3_4 {
    public static void main(String[] args) {
        Album a1 = new Album();
        Album a2 = new Album();
        a1.name = "Кукловод"; a1.author = "Металлов";
        a2.name = "Шоссе к ООП"; a2.author = "Асид";

        Track t1 = new Track("Состояние объектов","Янг",a2);
        Track t2 = new Track("Шоссе к ООП",a2);
        Track t3 = new Track("Одноразовый программист","Бертон",a1);


        a2.tracks = new Track[]{t1, t2};
        System.out.println(t1.showAlbum());
    }
}

class Track {
    private String name;
    private String author;
    private Album album;

    public Track(String name, String author, Album album) {

    }
    Track(String name, Album album){this(name, null, album);}
    Track(String name){this(name, null, null);}
    public String showAlbum() {
        return album.getTracks();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        try {
            if (album != null) throw new AccessDeniedException("Альбом уже есть");
            this.album = album;
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return name + ", " + (album.author != null && author != null && album.author != author ? "авторы: " + album.author + ", " + author :
                album.author != null && author == null ? "автор: " + album.author : "автор: " + author);
    }
}
class Album {
    String name;
    String author;
    ArrayList<Track> tracks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track t) {
        if (t.getAlbum() != null) throw new AccessDeniedException("Альбом уже есть");
    }
}
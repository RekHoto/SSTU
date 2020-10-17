package tasks.block3;

import javax.naming.directory.AttributeInUseException;
import java.util.ArrayList;

//Task3_4

public class Music {
    public static void main(String[] args) {
        Album a1 = new Album();
        Album a2 = new Album();
        a1.setName("Кукловод"); a1.setAuthor("Металлов");
        a2.setName("Шоссе к ООП"); a2.setAuthor("Асид");

        Track t1 = new Track("Состояние объектов","Янг",a2);
        Track t2 = new Track("Шоссе к ООП",a2);
        Track t3 = new Track("Одноразовый программист","Бертон",a1);


        a2.addTrack(t1); a2.addTrack(t2);
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
        return album.getTracks().toString();
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
            if (album != null) throw new AttributeInUseException("Альбом уже есть");
            this.album = album;
        } catch (AttributeInUseException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String albumAuthor = album.getAuthor();
        return name + ", " + (albumAuthor != null && author != null && albumAuthor != author ? "авторы: " + albumAuthor + ", " + author :
                albumAuthor != null && author == null ? "автор: " + albumAuthor : "автор: " + author);
    }
}
class Album {
    private String name;
    private String author;
    private ArrayList<Track> tracks;

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
        try {
            if (t.getAlbum() != null) throw new AttributeInUseException("Альбом уже есть");
        } catch (AttributeInUseException e) {
            e.printStackTrace();
        }
    }
}
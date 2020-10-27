package vlasov.music;

import vlasov.music.Album;
import javax.naming.directory.AttributeInUseException;

//Task3_4

public class Track {
    private String name;
    private String author;
    private Album album;

    public Track(String name, String author, Album album) {
        this.name = name;
        this.album = album;
        this.author = author;
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

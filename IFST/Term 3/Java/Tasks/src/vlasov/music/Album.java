package vlasov.music;

import javax.naming.directory.AttributeInUseException;
import java.util.ArrayList;

public class Album {
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

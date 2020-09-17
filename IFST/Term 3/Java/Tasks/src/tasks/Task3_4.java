package tasks;

public class Task3_4 {
    public static void main(String[] args) {
        Album a1 = new Album();
        Album a2 = new Album();
        a1.name = "Кукловод"; a1.author = "Металлов";
        a2.name = "Шоссе к ООП"; a2.author = "Асид";

        Track t1 = new Track();
        Track t2 = new Track();
        Track t3 = new Track();
        t1.name = "Состояние объектов"; t1.author = "Янг"; t1.album = a2;
        t2.name = "Шоссе к ООП"; t2.album = a2;
        t3.name = "Одноразовый программист"; t3.author = "Бертон"; t3.album = a1;

        a2.tracks = new Track[]{t1, t2};
        System.out.println(t1.showAlbum());
    }
}

class Track {
    String name;
    String author;
    Album album;

    public String showAlbum() {
        String str = "";
        for (int i = 0; i < album.tracks.length; i++) {
            str += album.tracks[i] + "\n";
        }
        return str;
    }

    public String toString() {
        return name + ", " + (album.author != null && author != null && album.author != author ? "авторы: " + album.author + ", " + author :
                album.author != null && author == null ? "автор: " + album.author : "автор: " + author);
    }
}
class Album {
    String name;
    String author;
    Track[] tracks;
}
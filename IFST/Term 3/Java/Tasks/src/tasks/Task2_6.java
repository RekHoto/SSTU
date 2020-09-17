package tasks;

public class Task2_6 {
    public static void main(String[] args) {
        Album2_6 a1 = new Album2_6();
        Album2_6 a2 = new Album2_6();
        a1.name = "Кукловод"; a1.author = "Металлов";
        a2.name = "Шоссе к ООП"; a2.author = "Асид";

        Track2_6 t1 = new Track2_6();
        Track2_6 t2 = new Track2_6();
        Track2_6 t3 = new Track2_6();
        t1.name = "Состояние объектов"; t1.author = "Янг"; t1.album = a2;
        t2.name = "Шоссе к ООП"; t2.album = a2;
        t3.name = "Одноразовый программист"; t3.author = "Бертон"; t3.album = a1;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
class Track2_6 {
    String name;
    String author;
    Album2_6 album;

    public String toString() {
        return name + ", " + (album.author != null && author != null && album.author != author ? "авторы: " + album.author + ", " + author :
                album.author != null && author == null ? "автор: " + album.author : "автор: " + author);
    }
}
class Album2_6 {
    String name;
    String author;
}
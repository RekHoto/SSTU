package vlasov.music;

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

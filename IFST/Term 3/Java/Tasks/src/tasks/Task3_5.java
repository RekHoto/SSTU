package tasks;

import java.util.ArrayList;

public class Task3_5 {
    public static void main(String[] args) {
        Post p1 = new Post("История транзистора.", "Дорога к твердотельным переключателям была долгой.\n" +
                "Она началась с открытия того, что определенные\n" +
                "материалы странно ведут себя в присутствии\n" +
                "электричества. В 1874 году Фердинанд Браун\n" +
                "опубликовал статью “О прохождении электрических\n" +
                "токов через сульфиды металлов”. И все завертелось…", new String[]{"История", "IT", "Электроника"}, 10);

        Comments c1 = new Comments(1, "Держите ссылку на то как работают светодиоды из карбида кремния ввв.свет.ру");
        Comments c2 = new Comments(0, "Спасибо!");
        Comments c3 = new Comments(0, "Thanks!");
        Comments c4 = new Comments(0, "Это перевод? Пойду оригинал почитаю");
        Comments c5 = new Comments(0, "а где ссылка на оригинал?");
        Comments c6 = new Comments(3, "автор, добавь ссылку в начало статьи");
        Comments c7 = new Comments(5, "Какую только дичь не писали в журналах 20-30гг пытаясь объяснить работу кристаллического детектора");

        p1.comments.add(c1); p1.comments.add(c4); p1.comments.add(c7);
        c1.setResponse(c2); c1.setResponse(c3); c4.setResponse(c5); c5.setResponse(c6);

        System.out.println(p1);
    }
}

class Post {
    String title;
    String text;
    String[] tags;
    ArrayList<Comments> comments = new ArrayList<Comments>();
    int rating;

    public Post(String title, String text, String[] tags, int rating) {
        this.title = title;
        this.text = text;
        this.tags = tags;
        this.rating = rating;
    }

    public String toString() {
        String str = "(" + rating + ") " + title + "\n" +
                "тэги: ";
        for (int i = 0; i < tags.length; i++) {
            str += i == tags.length - 1 ? tags[i] : tags[i] + ", ";
        }
        str += "\n" + text + "\nКомментарии: \n";
        for (int i = 0; i < comments.size(); i++) {
            str += comments.get(i) + "\n";
        }
        return str;
    }
}
package tasks;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;

public class Task3_5 {
    public static void main(String[] args) {
        Post p1 = new Post("История транзистора.", "Дорога к твердотельным переключателям была долгой.\n" +
                "Она началась с открытия того, что определенные\n" +
                "материалы странно ведут себя в присутствии\n" +
                "электричества. В 1874 году Фердинанд Браун\n" +
                "опубликовал статью “О прохождении электрических\n" +
                "токов через сульфиды металлов”. И все завертелось…", new String[]{"История", "IT", "Электроника"});

        p1.plusRating();
        p1.changeText("1");

        p1.addComment("Держите ссылку на то как работают светодиоды из карбида кремния ввв.свет.ру");
        p1.getComment(0).addResponse("Спасибо!");
        p1.getComment(0).addResponse("Thanks!");
        p1.addComment("Это перевод? Пойду оригинал почитаю");
        p1.getComment(1).addResponse("а где ссылка на оригинал?");
        p1.getComment(1).getResponse(0).addResponse("автор, добавь ссылку в начало статьи");
        p1.addComment("Какую только дичь не писали в журналах 20-30гг пытаясь объяснить работу кристаллического детектора");

        System.out.println(p1);
    }
}

class Post {
    final String title;
    private String text;
    private boolean changeable;
    final String[] tags;
    private ArrayList<Comments> comments;
    int rating;

    public Post(String title, String text, String[] tags) {
        this.title = title;
        this.text = text;
        this.tags = tags;
        this.rating = 0;
        this.changeable = true;
        this.comments = new ArrayList<Comments>();
    }

    public Comments getComment(int i) {
        try {
            return comments.get(i);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getTitle() {
        return title;
    }
    public void plusRating() {
        changeable = false;
        rating++;
    }
    public void minusRating() {
        changeable = false;
        rating--;
    }
    public void addComment(String str) {
        changeable = false;
        comments.add(new Comments(str));
    }

    public boolean isChangeable() {
        return changeable;
    }

    public void changeText(String text) {
        try {
            if (!changeable) throw new AccessDeniedException("Нельзя");
            this.text = text;
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }

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
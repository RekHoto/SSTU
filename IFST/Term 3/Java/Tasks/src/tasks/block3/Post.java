package tasks.block3;

import tasks.block2.Comments;

import javax.naming.directory.AttributeInUseException;
import java.util.ArrayList;

//Task3_5

public class Post {
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
            if (!changeable) throw new AttributeInUseException("Нельзя");
            this.text = text;
        } catch (AttributeInUseException e) {
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
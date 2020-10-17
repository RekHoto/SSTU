package tasks.block2;

import java.util.ArrayList;

//Task2_5
public class Comments {
    private int rating;
    private boolean changeable;
    private String comment;
    private ArrayList<Comments> response;
    private int lvl = 0;

    public Comments(String comment) {
        this.rating = 0;
        this.comment = comment;
        this.response = new ArrayList<Comments>();
    }

    public void plusRating() {
        changeable = false;
        rating++;
    }
    public void minusRating() {
        changeable = false;
        rating--;
    }
    public void addComment(Comments c) {
        changeable = false;
        response.add(c);
    }

    public void addResponse(String comment) {
        Comments resp = new Comments(comment);
        resp.lvl = this.lvl + 1;
        this.response.add(resp);

    }
    public Comments getResponse(int i) {
        try {
            return response.get(i);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String str = "";
        str += "(" + rating + ") " + comment;
        if (response != null) {
            for (int i = 0; i < response.size(); i++) {
                str += "\n";
                for (int j = 0; j < response.get(i).lvl; j++) {
                    str += "---";
                }
                str += response.get(i);
            }
        }
        return str;
    }
}
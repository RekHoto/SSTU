package tasks;

import java.util.ArrayList;

public class Task2_5 {
    public static void main(String[] args) {
        Comments c1 = new Comments();
        Comments c2 = new Comments();
        Comments c3 = new Comments();
        Comments c4 = new Comments();
        Comments c5 = new Comments();


        c1.rate = 100; c2.rate = 50; c3.rate = 0;
        c4.rate = 10;  c5.rate = 10; c4.comment = "asdfaskdf"; c5.comment = "aaa";
        c1.comment = "Что-то я ничего не понял"; c2.comment = "Что-то я ничего не понял..."; c3.comment = "что-то я ничего не понял...";
        c1.setResponse(c2); c2.setResponse(c3); c2.setResponse(c5); c1.setResponse(c4);

        System.out.println(c1);
    }
}
class Comments {
    int rate;
    String comment;
    ArrayList<Comments> response = new ArrayList<Comments>();
    int lvl = 0;

    public Comments(int rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }

    public Comments() {

    }

    public void setResponse(Comments response) {
        this.response.add(response);
        response.lvl = this.lvl + 1;
    }

    public String toString() {
        String str = "";
        str += "(" + rate + ") " + comment;
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
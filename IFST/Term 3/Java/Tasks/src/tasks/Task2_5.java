package tasks;

public class Task2_5 {
    public static void main(String[] args) {
        Comments c1 = new Comments();
        Comments c2 = new Comments();
        Comments c3 = new Comments();

        c1.rate = 100; c2.rate = 50; c3.rate = 0;
        c1.comment = "Что-то я ничего не понял"; c2.comment = "Что-то я ничего не понял..."; c3.comment = "что-то я ничего не понял...";
        c1.response = c2; c2.response = c3;

        System.out.println(c1);
    }
}
class Comments {
    int rate;
    String comment;
    Comments response;

    public String toString() {
        return "(" + rate + ") " + comment + (response != null ? "\n---" + response : "");
    }
}
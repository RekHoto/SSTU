package tasks;

public class Task1_2 {
    public static void main(String[] args) {
        Comment n = new Comment(169, "chto");
        Comment n2 = new Comment(148, "kto");
        Comment n3 = new Comment (0, "pochemu");
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
class Comment {
    int r;
    String comm;
    public Comment(int r, String comm) {
        this.r = r;
        this.comm = comm;
    }
    public String toString() {
        return "(" + r + ") " + comm;
    }
}

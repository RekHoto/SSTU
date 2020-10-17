package tasks.block1;

//Task1_2

public class Comment {
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

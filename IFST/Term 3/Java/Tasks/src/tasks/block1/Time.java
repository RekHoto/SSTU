package tasks.block1;

//Task1_5

public class Time {
    int t;
    private int dayt;
    public Time(int t) {
        this.t = t;
        dayt = t % 86400;
    }

    public String toString() {
        return (dayt / 3600 < 10 ? "0" + (dayt / 3600) : "" + (dayt / 3600)) + ":" +
                (dayt / 60 % 60 < 10 ? "0" + (dayt / 60 % 60) : "" + (dayt / 60 % 60)) + ":" +
                (dayt % 60 < 10 ? "0" + (dayt % 60) : "" + (dayt % 60));
    }
}
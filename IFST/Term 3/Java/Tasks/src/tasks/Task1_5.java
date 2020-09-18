package tasks;

public class Task1_5 {
    public static void main(String[] args) {
        Time1_5 n = new Time1_5(10);
        Time1_5 n2 = new Time1_5(10000);
        Time1_5 n3 = new Time1_5(100000);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Time1_5 {
    int t;
    private int dayt;
    public Time1_5(int t) {
        this.t = t;
        dayt = t % 86400;
    }

    public String toString() {
        return (dayt / 3600 < 10 ? "0" + (dayt / 3600) : "" + (dayt / 3600)) + ":" +
                (dayt / 60 % 60 < 10 ? "0" + (dayt / 60 % 60) : "" + (dayt / 60 % 60)) + ":" +
                (dayt % 60 < 10 ? "0" + (dayt % 60) : "" + (dayt % 60));
    }
}
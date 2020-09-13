public class Task1_5 {
    public static void main(String[] args) {
        Time n = new Time(10);
        Time n2 = new Time(10000);
        Time n3 = new Time(100000);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Time {
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
package tasks;

public class Task4_4 {
    public static void main(String[] args) {
        Time n = new Time(10);
        Time n2 = new Time(10000);
        Time n3 = new Time(10, 10, 10);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Time {
    private int t;
    private int h, m, s;

    public Time(int t) {
        if (t < 0) throw new IllegalArgumentException("часы такое не показывают");
        this.t = t % 86400;
        this.h = this.t / 3600;
        this.m = this.t / 60 % 60;
        this.s = this.t % 60;
    }
    public Time(int h, int m, int s) {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) throw new IllegalArgumentException("часы такое не показывают");
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getHours() {
        return h;
    }

    public int getMinutes() {
        return m;
    }

    public int getSeconds() {
        return s;
    }

    public String toString() {
        return (h < 10 ? "0" + h + ":": "" + h + ":") +
                (m < 10 ? "0" + m + ":" : "" + m + ":") +
                (s < 10 ? "0" + s : "" + s);
    }
}
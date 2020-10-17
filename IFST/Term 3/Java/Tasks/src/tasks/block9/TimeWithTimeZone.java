package tasks.block9;

import tasks.block4.Time;

//Task9_3

public class TimeWithTimeZone extends Time {
    private double utc;
    public TimeWithTimeZone(int h, int m, int s, double utc) {
        super(h, m, s);
        if (utc < -12 || utc > 14 || (utc % 0.5) != 0) throw new IllegalArgumentException();
        this.utc = utc;
    }
    public String toString() {
        int t = Math.abs((int)utc);
        return super.toString() + "(" + (utc >= 0 ? "+" : "-") + (t > 9 ? t : "0" + t) + ":" + (utc % 1 == 0 ? "0" : "3") + "0 UTC)";
    }

}
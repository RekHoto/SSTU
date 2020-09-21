package tasks;

public class Task4_2 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,3), new Point(23,8));
        System.out.println(l1);

        Line l2 = new Line(new Point(5, 10), new Point(25, 10));

        Line l3 = new Line(l1.getA(), l2.getB());
        System.out.println(l3);

        l1.setA(4,3); l2.setBX(0);
        System.out.println(l3);
        l1.setA(0,0);
        System.out.println(l3);

    }
}

class Line {
    private Point a;
    private Point b;

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }
    public Line(Point a, Point b) {
        this.a = new Point(a.x, a.y);
        this.b = new Point(b.x, b.y);
    }

    public Point getA() {return a;}
    public void setA(int x, int y) {this.a = new Point(x, y);}
    public Point getB() {return b;}
    public void setB(int x, int y) {this.b = new Point(x, y);}

    public int getAX(){return a.x;}
    public int getAY(){return a.y;}
    public int getBX(){return b.x;}
    public int getBY(){return b.y;}

    public void setAX(int x){this.a = new Point(x, a.y);}
    public void setAY(int y){this.a = new Point(a.x, y);}
    public void setBX(int x){this.a = new Point(x, b.y);}
    public void setBY(int y){this.a = new Point(b.x, y);}

    public int findLength() {
        double length = Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
        return (int)length;
    }
    public static double findLength(Point a, Point b) {
        double length = Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
        return length;
    }
    public String toString() {
        return a + ", " + b;
    }
}
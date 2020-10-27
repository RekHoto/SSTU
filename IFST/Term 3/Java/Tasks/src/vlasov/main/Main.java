package vlasov.main;

import vlasov.other.Fraction;
import vlasov.birds.*;
import vlasov.geometry.*;
import vlasov.other.Cat;
import vlasov.other.Meowers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 11.1
        System.out.println(addition(2, new Fraction(3, 5), 2.3));

        // 11.2
        singingBirds(new Sparrow(), new Sparrow(), new Cuckoo(),
                new Parrot("-classpath \"C:\\Users\\User\\Documents\\GitHub\\SSTU\\IFST\\Term 3\\Java\\Tasks\\out\\production\\Tasks\""));

        // 11.3
        System.out.println(sumOfAreas(new Square(new Point(0,0),10), new Circle(new Point(0,0), 3)));

        // 11.4
        meows(new Cat("imya"), new Cat("kto"));

        // 11.5
        List<Point> arr = new ArrayList<>();
        arr.add(new Point(0,0));
        arr.add(new Point(0,10));
        arr.add(new Point(10,10));
        System.out.println(sumOfLengths(new Line(new Point(0,0), new Point(0,10)),
                new PolygonalChain(arr)));

        // 11.6
        Square square = new Square(new Point(0,10), 15);
        System.out.println(square.getPolygonalChain().getLength());

        // 11.7
        List<Point> arr2 = new ArrayList<>();
        arr2.add(new Point(0, -10));
        arr2.add(new Point(-10,-10));
        arr2.add(new Point(-10,0));
        PolygonalChain chain = jointPolygonalChain(new Square(new Point(0,10), 10), new PolygonalChain(arr2));
        System.out.println(chain.getLength());
    }

    // 11.1
    public static double addition(Number... nums) {
        double res = 0;
        for (Number num:nums) {
            res += num.doubleValue();
        }
        return res;
    }

    // 11.2
    public static void singingBirds(Bird... birds) {
        for (Bird bird:birds) {
            bird.sing();
        }
    }

    // 11.3
    public static double sumOfAreas(Shape... shapes) {
        double res = 0;
        for (Shape shape:shapes) {
            res += shape.getArea();
        }
        return res;
    }

    // 11.4
    public static void meows(Meowers... meowers) {
        for (Meowers m:meowers) {
            m.meow();
        }
    }

    // 11.5
    public static double sumOfLengths(ObjectWithLength... objs) {
        double res = 0;
        for (ObjectWithLength obj:objs) {
            res += obj.getLength();
        }
        return res;
    }

    // 11.6
    public static PolygonalChain jointPolygonalChain(PolygonalChains... chains) {
        PolygonalChain res = new PolygonalChain();
        for (PolygonalChains chain:chains) {
            res.addPoints(chain.getPolygonalChain().getPoints());
        }
        return res;
    }
}

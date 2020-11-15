package vlasov.main;

import vlasov.other.*;
import vlasov.birds.*;
import vlasov.geometry.*;
import vlasov.people.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
/*
        // 11.1
        BigInteger n = new BigInteger("12345678912345678912");
        System.out.println(addition(2, new Fraction(3, 5), 2.3, n));

        // 11.2
        singingBirds(new Sparrow(), new Sparrow(), new Cuckoo(),
                new Parrot("-classpath \"C:\\Users\\User\\Documents\\GitHub\\SSTU\\IFST\\Term 3\\Java\\Tasks\\out\\production\\Tasks\""));

        // 11.3
        System.out.println(sumOfAreas(new Square(new Point(0,0),10), new Circle(new Point(0,0), 3)));

        // 11.4
        meows(new Cat("imya"), new Cat("kto"));

        // 11.5
        List<Point> arr = new ArrayList<>(Arrays.asList(new Point(0,0), new Point(0,10),new Point(10,10)));
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
        PolygonalChain chain = jointPolygonalChain(new Square(new Point(0,10), 10),
                new PolygonalChain(arr2),
                new Line(-10,10,-10,20));
        System.out.println(chain.getLength());

        // 11.8
        Shooter s1 = new Shooter("A");
        Shooter s2 = new Shooter("B");
        s2.setWeapon(new Pistol(6));
        Shooter s3 = new Shooter("C");
        s3.setWeapon(new Rifle());
        s3.getWeapon().load(30);
        s1.shoot(); s2.shoot(); s3.shoot();

        // 11.9
        City c1 = new CityTwoWayRoad("A");
        City c2 = new City("B");
        City c3 = new City("C");
        City c4 = new CityTwoWayRoad("D");
        City c5 = new City("E");
        c1.addWay(new Way(c2, 1));
        c1.addWay(new Way(c3,1));
        c2.addWay(new Way(c3,1));
        c4.addWay(new Way(c2,1));
        c4.addWay(new Way(c5,1));
        c5.addWay(new Way(c3,1));
        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n" + c5);

        // 12.4
        System.out.println(pow(args));

        // 12.5
        Point p = null;
        objectsToString(p, s1, arr2);

        // 12.6
        Point p1 = new Point(3,5);
        java.awt.Point p2 = new java.awt.Point(2,5);
        System.out.println(p1);
        System.out.println(p2);

        // 13.4
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = f1.clone();
        System.out.println(f1);
        System.out.println(f2);

        // 13.5
        Point po1 = new Point(2,5);
        Point po2 = po1.clone();
        po1.setX(4);
        System.out.println(po1);
        System.out.println(po2);

        // 13.6
        Line l1 = new Line(new Point(1,1), new Point(0,0));
        Line l2 = l1.clone();
        l1.setA(3,3);
        l2.setB(10,10);
        System.out.println(l1);
        System.out.println(l2);



        Name n = Name.getBuilder().setFname("a").setPat("b").getName();
        System.out.println(n);

 */
        Student<Integer> st1 = new Student<>("st1", x->(x >= 2 && x <= 5), 5, 5, 4, 2, 5, 5);
        Student<Integer> st3 = new Student<>("st1", x->(x >= 2 && x <= 5), 5, 5, 4, 2, 4, 4);
        Student<Integer> st2 = new Student<>("st1", x->(x >= 2 && x <= 5), 5, 5, 4, 2, 3, 3);
        Student<Integer> st4 = new Student<>("st1", x->(x >= 2 && x <= 5), 5, 5, 4, 2, 2, 2);
        Comparator<Student<Integer>> c = (o1, o2) -> {
            double avg1 = o1.getMarks().stream().mapToInt(x->x).average().getAsDouble();
            double avg2 = o2.getMarks().stream().mapToInt(x->x).average().getAsDouble();
            return Double.compare(avg1, avg2);
        };
        List<Student<Integer>> list = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));
        list.sort(c);

        Fraction f1 = new Fraction(5, 0);
        System.out.println(f1.intValue());
        /* itmoha
        Paragraph p = new Paragraph(List.of(
                new Strong(List.of(
                        new Text("1"),
                        new Strikeout(List.of(
                                new Text("2"),
                                new Emphasis(List.of(
                                        new Text("3"),
                                        new Text("4")
                                )),
                                new Text("5")
                        )),
                        new Text("6")
                ))
        ));
        StringBuilder s = new StringBuilder();
        p.toHtml(s);
        System.out.println(s);

        final Game game = new Game(new Player(), new Player(), true);
        int result;
        do {
            result = game.play(new Board());
            System.out.println("Game result: " + result);
        } while (result != 0);

         */
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
    public static void meows(Meowable... meowers) {
        for (Meowable m:meowers) {
            m.meow();
        }
    }

    // 11.5
    public static double sumOfLengths(Lengthable... objs) {
        double res = 0;
        for (Lengthable obj:objs) {
            res += obj.getLength();
        }
        return res;
    }

    // 11.7
    public static PolygonalChain jointPolygonalChain(PolygonalChainable... chains) {
        PolygonalChain res = new PolygonalChain();
        for (PolygonalChainable chain:chains) {
            res.addPoints(chain.getPolygonalChain().getPoints());
        }
        return res;
    }

    //12.4
    public static int pow(String[] strings) {
        return (int)Math.pow(Double.parseDouble(strings[0]), Double.parseDouble(strings[1]));
    }

    //12.5
    public static void objectsToString(Object... objs) {
        for (Object obj:objs) {
            System.out.println(Objects.toString(obj, "Zdes' mog by byt' vash ob'ekt"));
        }
    }

    // something
    public static List<CloneableMethod> cloneAll(CloneableMethod... objs) {
        List<CloneableMethod> res = new ArrayList<>();
        for (CloneableMethod obj : objs) res.add(obj.clone());
        return res;
    }

}

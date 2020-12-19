package vlasov.main;

import vlasov.people.Name;
import vlasov.people.karate.*;
import vlasov.animals.Meowable;
import vlasov.other.*;
import vlasov.birds.*;
import vlasov.math.geometry.*;
import vlasov.people.students.Save;
import vlasov.people.students.Student;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        GroupMove g1 = new GroupMove(new Line(1, 2, 1, 2), new Line(1, 2, 1, 2));
        GroupMove g2 = new GroupMove(new Line(1, 2, 1, 2), new Line(1, 2, 1, 2));
        GroupMove g3 = new GroupMove(g1, new Line(0,0,0,0), g2);
        g3.move(-2, 5);
        System.out.println(g3.toString());

        Karatist k = new Karatist("kto");

        Combo combo = new Combo(Karatist::jumpKick, x->x.jumpKick(),Karatist::kick, JumpKick.INSTANCE, JumpKick2.INSTANCE);
        combo.execute(k);

        Student<Integer> s1 = new Student<>("a", x -> x <= 5 && x >= 2, 2, 4, 4, 3, 5);
        Save save = s1.saveState();
        s1.addMarks(2, 3);
        s1.setName("b");
        System.out.println(s1);
        save.load();
        System.out.println(s1);

        Name n = Name.getBuilder().setFname("Иванов").setSname("Иван").setPat("Иванович").getName();
        System.out.println(n);

//        // itmoha
//        Paragraph p = new Paragraph(List.of(
//                new Strong(List.of(
//                        new Text("1"),
//                        new Strikeout(List.of(
//                                new Text("2"),
//                                new Emphasis(List.of(
//                                        new Text("3"),
//                                        new Text("4")
//                                )),
//                                new Text("5")
//                        )),
//                        new Text("6")
//                ))
//        ));
//        StringBuilder s = new StringBuilder();
//        p.toHtml(s);
//        System.out.println(s);
//

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
    public static List<CloneableMethod> cloneAll(CloneableMethod... objs) throws CloneNotSupportedException {
        List<CloneableMethod> res = new ArrayList<>();
        for (CloneableMethod obj : objs) res.add(obj.clone());
        return res;
    }

    public static <T,Q> List<Q> method(List<T> list, MyModifier<T, Q> m) {
        List<Q> res = new ArrayList<>();
        for (T t : list) res.add(m.modify(t));
        return res;
    }
    public static <T> List<T> method2(List<T> list, Predicate<T> pr) {
        List<T> res = new ArrayList<>();
        for (T t : list) {
            if (pr.test(t)) res.add(t);
        }
        return res;
    }
    public static <T> T method3(List<T> list, Returner<T> r) {
        if (list == null || list.size() == 0) return null;
        T res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res = r.ret(res, list.get(i));
        }
        return res;
    }
    public static List<String> strings(List<String> list, Predicate<String> pr) {
        List<String> res = new ArrayList<>();
        for (String str : list) {
            if (str.length() < 10) {
                res.add(str);
            }
        }
        return res;
    }
}

class StringL extends Number {
    String str;

    public StringL(String str) {
        this.str = str;
    }

    @Override
    public int intValue() {
        int res = 0;
        for (int i = 0; i < str.length(); i++) res += str.charAt(i);
        return res;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float) intValue();
    }

    @Override
    public double doubleValue() {
        return intValue();
    }
}

class MeowCount implements Meowable {
    int counter;
    Meowable m;

    public MeowCount(Meowable m) {
        this.m = m;
    }

    @Override
    public void meow() {
        counter++;
        m.meow();
    }

    public int getCounter() {
        return counter;
    }
}
package tasks;

public class Task3_2 {
    public static void main(String[] args) {
        Rbook r1 = new Rbook();
        r1.studentName = "Вася"; r1.id = 171896;
        r1.res = new Discipline[]{new Discipline("Информатика", "Ермаков", 5),
                new Discipline("Математика", "Петрова", 4),
                new Discipline("Физика", "Сидоров", 5)};
        System.out.println(r1);

        r1.res[2] = new Discipline("Английский язык","Буров",4);
        System.out.println(r1);

        Rbook r2 = new Rbook();
        r2.studentName = "Петя"; r2.id = 173654;
        r2.copyRes(r1.res);
        System.out.println(r2);

        r1.res[2].mark = 5;
        System.out.println(r2);
    }
}

class Rbook {
    long id;
    String studentName;
    Discipline[] res;

    public void copyRes(Discipline[] arr) {
        this.res = new Discipline[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.res[i] = new Discipline(arr[i]);
        }
    }

    public String toString() {
        String str = studentName + ", №" + id + ":\n";
        for (int i = 0; i < res.length; i++) {
            str += "    " + res[i] + "\n";
        }
        return str;
    }
}
class Discipline {
    String name;
    String teacher;
    int mark;

    public Discipline(Discipline d) {
        this.name = d.name;
        this.teacher = d.teacher;
        this.mark = d.mark;
    }

    public Discipline(String name, String teacher, int mark) {
        this.name = name;
        this.teacher = teacher;
        this.mark = mark;
    }

    public String toString() {
        return name + ", " + teacher + ", " + mark;
    }
}
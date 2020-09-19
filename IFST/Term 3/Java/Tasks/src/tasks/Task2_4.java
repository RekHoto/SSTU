package tasks;

public class Task2_4 {
    public static void main(String[] args) {
        Department d1 = new Department();
        Employee w1 = new Employee();
        Employee w2 = new Employee();
        Employee w3 = new Employee();

        d1.name = "IT";
        w1.name = "Петров"; w2.name = "Козлов"; w3.name = "Сидоров";
        w1.dep = d1; w2.dep = d1; w3.dep = d1;
        d1.boss = w2;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}

class Employee {
    String name;
    Department dep;

    public String toString() {
        return this.equals(dep.boss) ? name + " начальник в отделе " + dep.name : name + " работает в отделе " + dep.name + ", начальник которого " + dep.boss.name;
    }


}

class Department {
    String name;
    Employee boss;
}
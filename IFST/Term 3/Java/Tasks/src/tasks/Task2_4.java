package tasks;

public class Task2_4 {
    public static void main(String[] args) {
        Department d1 = new Department("IT");
        Employee w1 = new Employee("Петров", d1);
        Employee w2 = new Employee("Козлов");
        Employee w3 = new Employee("Сидоров", d1);
        d1.setBoss(w2);
        d1.setBoss(w1);


        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}

class Employee {
    private String name;
    private Department dep;

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }
    Employee(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        try {
            if (this.equals(dep.getBoss())) throw new Exception("Сначала назначьте другого начальника");
            this.dep = dep;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String toString() {
        if (dep != null) {
            return this.equals(dep.getBoss()) ? name + " начальник в отделе " + dep.getName() : name + " работает в отделе " + dep.getName() + ", начальник которого " + dep.getBoss().getName();
        } else {
            return name;
        }
    }

}

class Department {
    private String name;
    private Employee boss;

    public Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
    }
    Department(String name) {
        this(name, null);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoss(Employee boss) {
        try {
            if (boss.getDep() == null || !boss.getDep().equals(this)) throw new Exception("Начальник отдела должен работать в этом же отделе");
            this.boss = boss;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }
}
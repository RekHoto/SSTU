package vlasov.people.office;

public class Employee {
    String name;
    Department dep;

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
        if (this == dep.boss) throw new RuntimeException("Сначала назначьте другого начальника");
        this.dep = dep;
    }

    public String toString() {
        if (dep != null) {
            return name + (this == dep.boss ? " начальник в отделе " + dep.name : " работает в отделе " + dep.name + ", начальник которого " + dep.boss.name);
        } else {
            return name;
        }
    }

}


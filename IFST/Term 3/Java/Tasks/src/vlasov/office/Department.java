package vlasov.office;

public class Department {
    String name;
    Employee boss;

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
        if (boss.dep == null || boss.dep != this) throw new RuntimeException("Начальник отдела должен работать в этом же отделе");
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }
}

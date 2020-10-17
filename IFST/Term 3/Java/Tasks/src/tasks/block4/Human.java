package tasks.block4;

//Task4_6

public class Human {
    Name name;
    private int height;
    final Human dad;

    public Human(Name name, int height, Human dad) {
        if (height > 500 || height < 0) throw new IllegalArgumentException("Рост не тот");
        this.name = name;
        this.height = height;
        this.dad = dad;
        if (dad != null) {
            if (name.getSname() == null && dad.name.getSname() != null) {
                name.setSname(dad.name.getSname());
            }
            if (name.getPat() == null) {
                name.setPat(dad.name.getPat() + "ович");
            }
        }
    }

    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Human getDad() {
        return dad;
    }



    Human(String fname, int height) {
        this(new Name(fname), height, null);
    }
    Human(String fname, int height, Human dad) {
        this(new Name(fname, dad.name.getSname(), dad.name.getFname() + "ович"), height, new Human(dad.getName(), dad.getHeight(), dad.getDad()));
    }
    Human(Name name, int height) {
        this(name, height, null);
    }

    public String toString() {
        return name + ", " + height;
    }
}

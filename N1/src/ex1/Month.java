package ex1;

public class Month {
    final private String name;

    public Month(String name) {
        this.name = name;
    }

    public Month(Month other) {
        this.name = other.name;
    }

    public String getName() {
        return name;
    }
}

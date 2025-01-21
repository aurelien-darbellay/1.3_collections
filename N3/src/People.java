import java.util.Comparator;

public class People {
    private final String name;
    private final String lastname;
    private final String dni;

    public People(String name, String lastname, String dni) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
    }
    public static class CompareName implements Comparator<People> {
        @Override
        public int compare(People o1, People o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }
    public static class CompareLastName implements Comparator<People>{
        @Override
        public int compare(People o1, People o2) {
            return o2.getLastname().compareTo(o1.getLastname());
        }
    }
    public static class CompareDni implements Comparator<People>{
        @Override
        public int compare(People o1, People o2) {
            return o2.getDni().compareTo(o1.getDni());
        }
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getLastname() + " " + this.getDni();
    }
}

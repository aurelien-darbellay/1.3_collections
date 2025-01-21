package Model;

import java.io.FileWriter;
import java.io.IOException;
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

    public static Comparator<People> compareByName = Comparator.comparing(People::getName);

    public static Comparator<People> compareByLastName = Comparator.comparing(People::getLastname);

    public static Comparator<People> compareByDni = Comparator.comparing(People::getDni);

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

    private String toCSV() {
        return this.getName() + ";" + this.getLastname() + ";" + this.getDni() + "\n";
    }

    public void writeToCsv(FileWriter writer) {
        try {
            writer.write(this.toCSV());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

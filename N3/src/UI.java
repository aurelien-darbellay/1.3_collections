import Model.People;

import java.util.Scanner;
import java.util.Set;

public class UI {
    static final Scanner scanner = new Scanner(System.in);
    static final String menu = """
            What do you want to do?
            1. Introduce new person
            2. Show people ordered by name (A-Z)
            3. Show people ordered by name (Z-A)
            4. Show people ordered by last name (A-Z)
            5. Show people ordered by last name (Z-A)
            6. Show people ordered by DNI (A-Z)
            7. Show people ordered by DNI (Z-A)
            8. Exit
            """;

    static String menu() {
        System.out.println(menu);
        return scanner.nextLine();
    }

    static String[] getNewPersonData() {
        System.out.println("Give me the name of the person you want to introduce: ");
        String name = scanner.nextLine();
        System.out.println("Give me the last name of the person you want to introduce: ");
        String lastname = scanner.nextLine();
        System.out.println("Give me Dni of the person you want to introduce: ");
        String dni = scanner.nextLine();
        return new String[]{name, lastname, dni};
    }

    static void printOrderedCommunity(Set<People> orderedCommunity) {
        orderedCommunity.forEach(person -> System.out.println(person.toString()));
    }
}


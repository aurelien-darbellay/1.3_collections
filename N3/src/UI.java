import java.io.IOException;
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
    static void start(Community community){
        String input = "";
        while (!input.equals("8")) {
            System.out.println(menu);
            input = scanner.nextLine();
            switch (input) {
                case "1": createNewPerson(community);
                    break;
                case "2":showPeopleOrderedByName(community);
                    break;
                case "3": showPeopleReverseOrderedByName(community);
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("Unknown entry. Let's start again");
                    start(community);
            }
        }

    }

    static void createNewPerson(Community community){
        System.out.println("Give me the name of the person you want to introduce: ");
        String name = scanner.nextLine();
        System.out.println("Give me the last name of the person you want to introduce: ");
        String lastname = scanner.nextLine();
        System.out.println("Give me Dni of the person you want to introduce: ");
        String dni = scanner.nextLine();
        People newPerson = new People(name,lastname,dni);
        community.add(newPerson);
    }
    static void showPeopleOrderedByName(Community community){
       Set<People> orderedCommunity = community.orderBy(new People.CompareName());
       orderedCommunity.forEach(person->System.out.println(person.toString()));
    }
    static void showPeopleReverseOrderedByName(Community community){
        Set<People> orderedCommunity = community.orderBy(new People.CompareName().reversed());
        orderedCommunity.forEach(person->System.out.println(person.toString()));
    }
    static void showPeopleOrderedByLastName(Community community){
        Set<People> orderedCommunity = community.orderBy(new People.CompareLastName());
        orderedCommunity.forEach(person->System.out.println(person.toString()));
    }
    static void showPeopleReverseOrderedByLastName(Community community){
        Set<People> orderedCommunity = community.orderBy(new People.CompareLastName().reversed());
        orderedCommunity.forEach(person->System.out.println(person.toString()));

    }
    static void showPeopleOrderedByDni(Community community){
        Set<People> orderedCommunity = community.orderBy(new People.CompareDni());
        orderedCommunity.forEach(person->System.out.println(person.toString()));
    }
    static void showPeopleReverseOrderedByDni(Community community){
        Set<People> orderedCommunity = community.orderBy(new People.CompareDni().reversed());
        orderedCommunity.forEach(person->System.out.println(person.toString()));
    }
}


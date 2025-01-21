import Model.Community;
import Model.People;

public class Controller {
    static void start(Community community) {
        String input = "";
        while (!input.equals("8")) {
            input = UI.menu();
            switch (input) {
                case "1":
                    createNewPerson(community);
                    break;
                case "2":
                    UI.printOrderedCommunity(community.orderBy(People.compareByName));
                    break;
                case "3":
                    UI.printOrderedCommunity(community.orderBy(People.compareByName.reversed()));
                    break;
                case "4":
                    UI.printOrderedCommunity(community.orderBy(People.compareByLastName));
                    break;
                case "5":
                    UI.printOrderedCommunity(community.orderBy(People.compareByLastName.reversed()));
                    break;
                case "6":
                    UI.printOrderedCommunity(community.orderBy(People.compareByDni));
                    break;
                case "7":
                    UI.printOrderedCommunity(community.orderBy(People.compareByDni.reversed()));
                    break;
                case "8":
                    break;
                default:
                    System.out.println("Unknown entry. Let's start again");
            }
        }
        System.out.println("My work is done... saving data.");
    }

    static void createNewPerson(Community community) {
        String[] personalData = UI.getNewPersonData();
        People newPerson = new People(personalData[0], personalData[1], personalData[2]);
        community.add(newPerson);
    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private final static String fileUrl = "N3/assets/personas.csv";
    public static void main(String[] args) {
        Scanner scanner;
        File file = new File(fileUrl);
        try {
            scanner = new Scanner(file);
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        Community community = new Community();
        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(";");
            People newPerson = new People(data[0],data[1],data[2]);
            community.add(newPerson);
        }
        UI.start(community);
    }
}
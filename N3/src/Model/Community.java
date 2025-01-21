package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Community extends HashSet<People> {
    public Community() {
    }

    public Set<People> orderBy(Comparator<People> comparator) {
        Set<People> orderedCommunity = new TreeSet<People>(comparator);
        orderedCommunity.addAll(this);
        return orderedCommunity;
    }

    public void fillCommunityFromFile(File dataCommunity) {
        Scanner scanner;
        try {
            scanner = new Scanner(dataCommunity);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(";");
            People newPerson = new People(data[0], data[1], data[2]);
            this.add(newPerson);
        }
    }

    public void saveCommunityInFile(File dataCommunity) {
        try {
            FileWriter writer = new FileWriter(dataCommunity);
            this.forEach(person -> {
                person.writeToCsv(writer);
            });
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

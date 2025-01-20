package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private File file;
    private Scanner scanner;

    public Reader(String fileUrl) {
        this.file = new File(fileUrl);
        try {this.scanner = new Scanner(this.file);}
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public String readWord(){
        return scanner.next();
    }
    public String readLine(){
        return scanner.nextLine();
    }
    public boolean finishedReading(){
        return scanner.hasNext();
    }
}

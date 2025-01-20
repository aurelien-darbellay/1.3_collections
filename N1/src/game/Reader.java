package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private File file;
    private Scanner scanner;

    public Reader(String fileUrl) throws FileNotFoundException {
        this.file = new File(fileUrl);
        this.scanner = new Scanner(this.file);
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

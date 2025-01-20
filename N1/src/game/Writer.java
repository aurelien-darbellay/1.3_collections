package game;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private File file;
    private FileWriter writer;

    public Writer(String fileUrl) {
        this.file = new File(fileUrl);
        try {
            this.writer = new FileWriter(this.file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            this.file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String text) {
        try {
            writer.write(text);
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

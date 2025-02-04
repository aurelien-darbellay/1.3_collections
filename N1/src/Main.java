import ex1.FlowEx1;
import ex2.FlowEx2;
import game.Game;

public class Main {

    //global variable for Exercise 3
    final static private String fileUrl = "N1/assets/countries.txt";
    final static private String fileToWriteUrl = fileUrl.replaceFirst("countries.txt", "classification.txt");

    public static void main(String[] args) {
        //  Exercise 1
        FlowEx1.run();

        //Exercise 2
        FlowEx2.run();

        //Exercise 3
        Game game = new Game(fileUrl, fileToWriteUrl);
        game.play();

    }
}
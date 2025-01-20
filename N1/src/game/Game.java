package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Game {
    final private HashMap<String, String> data;
    final Scanner scanner = new Scanner(System.in);
    final List<String> keys;
    final String fileClassificationUrl;

    public Game(String gameData, String fileClassificationUrl) {
        this.data = new HashMap<String, String>(60);
        Reader reader = new Reader(gameData);
        while (reader.finishedReading()) {
            String[] data = reader.readLine().split(" ");
            String country = data[0];
            String capital = data[1];
            this.data.put(country, capital);
        }
        this.keys = new ArrayList<String>(this.data.keySet());
        this.fileClassificationUrl = fileClassificationUrl;
    }

    private boolean playATurn() {
        int index = (int) Math.floor(Math.random() * keys.size());
        String country = keys.get(index);
        System.out.println("What is the capital of " + country + "?");
        boolean result = checkAnswer(country, scanner.nextLine());
        if (!result) giveCorrectAnswer(country);
        else congrats();
        keys.remove(country);
        return result;
    }

    private boolean checkAnswer(String question, String answer) {
        return this.data.get(question).equals(answer);
    }

    private void congrats() {
        System.out.println("Good Job!");
    }

    private void giveCorrectAnswer(String question) {
        System.out.println("Ouch...not quite! The correct answer was " + this.data.get(question));
    }

    private void gameOver(String nameUser, int pointsUser) {
        Writer writer = new Writer(fileClassificationUrl);
        writer.write("Name: " + nameUser + ", Points : " + pointsUser);
        System.out.println("The game is over " + nameUser + ". You have scored " + pointsUser + " points.");
    }

    public void play() {
        System.out.println("What is your name?");
        String nameUser = scanner.nextLine();
        int pointsUser = 0;
        for (int i = 0; i < 10; i++) {
            boolean result = playATurn();
            if (result) {
                pointsUser++;
            }
        }
        this.gameOver(nameUser, pointsUser);

    }
}

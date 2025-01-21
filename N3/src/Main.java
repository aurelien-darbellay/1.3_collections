import Model.Community;

import java.io.File;

public class Main {
    private final static String fileUrl = "N3/assets/personas.csv";

    public static void main(String[] args) {
        Community community = new Community();
        File dataCommunity = new File(fileUrl);
        community.fillCommunityFromFile(dataCommunity);
        Controller.start(community);
        community.saveCommunityInFile(dataCommunity);
    }
}
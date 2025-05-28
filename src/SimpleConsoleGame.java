import java.util.Scanner;
import java.util.ArrayList;

public class SimpleConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<PlayerObject> Players = new ArrayList<>();

        int playerCount = 0;


        while (true) {
            System.out.println("To quit the game, enter letter Q");

            System.out.println("Hello Player " + playerCount +  ", what is your name?");
            String name = scanner.nextLine();

            if (name.contains("Qq")) {
                break;
            }

            System.out.println("Welcome" + name + ", Please enter your score");

            int score = validateScore(scanner.nextLine());

            if (score < 0) {
                System.out.println("Invalid score!!. Please enter a valid number.");
                continue;
            }

            Players.add(new PlayerObject(name, score));
            playerCount++;
            System.out.println(name + ", your score " + score + " has been registered");




        }

        Players.sort((a, b) -> b.getScore() - a.getScore());

        System.out.println("\n🏆 Leaderboard 🏆");

        for (int i = 0; i < Players.size(); i++) {
            PlayerObject player = Players.get(i);
            System.out.println((i + 1) + ". " + player.getName() + " - " + player.getScore());
        }


    }

    public static int validateScore(String score) {
        try {
            return Integer.parseInt(score);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

class PlayerObject {
    private String name;
    private int score;

    PlayerObject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}



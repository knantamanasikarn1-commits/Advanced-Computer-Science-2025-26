import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your name:");
        String name = scan.nextLine();
        System.out.println("Please input your choice:");
        String choice = scan.nextLine();
        choice = choice.toLowerCase();
        int numChances = 1;
        while (! validateChoice(choice) && numChances < 3) {
            System.out.println("Invalid choice. Please input your choice: ");
            choice = scan.nextLine();
            choice = choice.toLowerCase();
            numChances += 1;
        }
        if (! validateChoice(choice)) {
            System.out.println("A random choice will be assigned.");
            choice = RPSGame.generateRandomChoice();
        }
        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        this.player.setChoice(choice);
        this.player.setName(name);
    }

    public boolean didPlayerWin() {
        String playerChoice = player.getChoice();
        String oppChoice = opponent.getChoice();
        if (playerChoice.equals("rock")) {
            return oppChoice.equals("scissors");
        }
        if (playerChoice.equals("paper")) {
            return oppChoice.equals("rock");
        }
        if (playerChoice.equals("scissors")) {
            return oppChoice.equals("paper");
        }
        return false; // Just in case, but shouldn't need this
    }

    public String toString() {
        String returnedString;
        if (didPlayerWin()) {
            returnedString = player.getName() + " won!\nCongratulations!";
        } else {
            returnedString = "Opponent won/tied!\nBetter luck next time!";
        }
        return returnedString;
    }

    public String displayResults() {
        String returnedString = "== GAME RESULTS ==\n";
        returnedString += player.getName() + " chose " + player.getChoice() + ".\n";
        returnedString += "Opponent chose " + opponent.getChoice() + ".\n";
        returnedString += toString();
        return returnedString;
    }

    public static boolean validateChoice(String choice) {
        return (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }

    public static String generateRandomChoice() {
        int choiceNum = (int) (Math.random() * 3);
        if (choiceNum == 0) {
            return "rock";
        } else if (choiceNum == 1) {
            return "scissors";
        } else if (choiceNum == 2) {
            return "paper";
        }
        return "";
    }
}

public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (! RPSGame.validateChoice(this.choice)) {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String getChoice() {
        return choice;
    }

    public String toString() {
        String returnedString = "Opponent chose " + choice + ".";
        return returnedString;
    }
}
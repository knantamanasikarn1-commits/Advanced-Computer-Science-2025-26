public class Player {
    private String name;
    private String choice;

    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        if (! RPSGame.validateChoice(choice)) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice;
        }
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public String toString() {
        String returnedString = name + " chose " + choice + ".";
        return returnedString;
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // TODO
        System.out.println("== CARD CLASH ==");
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);
        boolean isPlayerTurn;
        if (rng.nextDouble() < 0.5) {
            System.out.println("Starting: Player");
            isPlayerTurn = true;
        } else {
            System.out.println("Starting: Bot");
            isPlayerTurn = false;
        }
        while (!player.hasAnythingLeft() && !bot.hasAnythingLeft()) {
            if (isPlayerTurn) {
                drawAndPlayIfNeeded(player, bot);
                attackOnce(player, bot);
            } else {
                drawAndPlayIfNeeded(bot, player);
                attackOnce(bot, player);
            }
            isPlayerTurn = !isPlayerTurn;
        }
        if (!player.hasAnythingLeft()) {
            System.out.println("Winner: Bot");
            return "Bot";
        } else {
            System.out.println("Winner: Player");
            return "Player";
        }
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.active != null) {
            return;
        }
        self.active = self.deck.remove(0);
        self.active.applySelfOnPlay(self.active.resolvedAbility());
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.active == null || defender.active == null) {
            return;
        }
        Card attackingCard = attacker.active;
        Card defendingCard = defender.active;
        defendingCard.takeDamage(attackingCard.computeDamageAgainst(defendingCard));
        if (defendingCard.isDefeated()) {
            defender.active = null;
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
        ArrayList<Card> player = DecksAndChecks.buildUserDeck(sc);
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DecksAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}

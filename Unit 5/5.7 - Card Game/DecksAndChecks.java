import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int abilityCardCount = 0;
        for (Card card : deck) {
            if (card.abilityCount() >= 1) {
                abilityCardCount ++;
            }
        }
        return (abilityCardCount <= 3);
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        boolean hasBastion = false;
        boolean hasRipple = false;
        boolean hasCleave = false;
        for (Card card : deck) {
            if (card.hasBastion()) {
                if (hasBastion) {
                    return false;
                }
                hasBastion = true;
            }
            if (card.hasRipple()) {
                if (hasRipple) {
                    return false;
                }
                hasRipple = true;
            }
            if (card.hasCleave()) {
                if (hasCleave) {
                    return false;
                }
                hasCleave = true;
            }
        }
        return true;
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (!checkIndividualCardStatsinRange(card.getStrength(), card.getToughness())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIndividualCardStatsinRange(int strength, int toughness) {
        if (strength < 1 || strength > 5 || toughness < 1 || toughness > 5) {
            return false;
        }
        if (strength + toughness > 6) {
            return false;
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck.size() != 5) {
            return false;
        }
        if (! checkOneAbilityPerCard(deck)) {
            return false;
        }
        if (! checkNoMoreThanThreeAbilityCards(deck)) {
            return false;
        }
        if (! checkNoDuplicateAbilities(deck)) {
            return false;
        }
        return true;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return deck
    //   of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) {
            CardType randomCardType;
            double randomChance = Math.random();
            if (randomChance < 1/3) {
                randomCardType = CardType.BLADE;
            } else if (randomChance < 2/3) {
                randomCardType = CardType.GRANITE;
            } else {
                randomCardType = CardType.PARCHMENT;
            }
            deck.add(new NamedCard("Player-"+i, randomCardType, 3, 3, 
                false, false, false));
        }
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<Card>(5);
        // All at once in a single string:  "BestRock, Granite, 5, 1, n, n, y"
        // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
        int createdCards = 0;
        while (createdCards < 5) {
            System.out.println("CREATING CARD " + (createdCards+1) + ": ");
            System.out.println("All at once in a single string. ex : \"BestRock, Granite, 5, 1, n, n, y\"\n"
                + "( name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n) )");
            String inputString = sc.nextLine();
            String[] inputArray = inputString.split(" ");
            if (inputArray.length != 7) {
                System.out.println("\tThe input must be of the form: "
                    + "name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)");
                continue;
            }
            String name = inputArray[0];
            CardType type = CardType.fromText(inputArray[1]);
            int strength = Integer.parseInt(inputArray[2]);
            int toughness = Integer.parseInt(inputArray[3]);
            boolean hasBastion = isYes(inputArray[4]);
            boolean hasRipple = isYes(inputArray[5]);
            boolean hasCleave = isYes(inputArray[6]);
            NamedCard newCard = new NamedCard(name, type, strength, toughness, hasBastion, hasRipple, hasCleave);
            deck.add(newCard);
            createdCards ++;
            // // System.out.println("CREATING CARD " + (i+1) + ": ");
            // System.out.print("Name?: ");
            // String name = sc.nextLine();
            // System.out.print("Card Type? (granite/g, parchment/p, blade/b): ");
            // CardType type = CardType.fromText(sc.nextLine());
            // while (type == null) {
            //     System.out.println("\tType must be either granite/g, parchment/p, or blade/b.");
            //     System.out.print("Card Type? (granite/g, parchment/p, blade/b): ");
            //     type = CardType.fromText(sc.nextLine());
            // }
            // System.out.print("Strength? (1-5): ");
            // int strength = Integer.parseInt(sc.nextLine());
            // System.out.print("Toughness? (1-5): ");
            // int toughness = Integer.parseInt(sc.nextLine());
            // while (!checkIndividualCardStatsinRange(strength, toughness)) {
            //     System.out.println("\tStrength and toughness sum must be no greater than 6!");
            //     System.out.print("Strength? (1-5): ");
            //     strength = Integer.parseInt(sc.nextLine());
            //     System.out.print("Toughness? (1-5): ");
            //     toughness = Integer.parseInt(sc.nextLine());
            // }
            // System.out.print("Has Bastion Ability? (yes/y, no/n; only one ability): ");
            // boolean hasBastion = isYes(sc.nextLine());
            // System.out.print("Has Ripple Ability? (yes/y, no/n; only one ability): ");
            // boolean hasRipple = isYes(sc.nextLine());
            // System.out.print("Has Cleave Ability? (yes/y, no/n; only one ability): ");
            // boolean hasCleave = isYes(sc.nextLine());
            // int abilityCount = (hasBastion ? 1 : 0) + (hasRipple ? 1 : 0) + (hasCleave ? 1 : 0);
            // while (abilityCount > 1) {
            //     System.out.println("\tA card can only have one ability!");
            //     System.out.print("Has Bastion Ability? (yes/y, no/n): ");
            //     hasBastion = isYes(sc.nextLine());
            //     System.out.print("Has Ripple Ability? (yes/y, no/n): ");
            //     hasRipple = isYes(sc.nextLine());
            //     System.out.print("Has Cleave Ability? (yes/y, no/n): ");
            //     hasCleave = isYes(sc.nextLine());
            //     abilityCount = (hasBastion ? 1 : 0) + (hasRipple ? 1 : 0) + (hasCleave ? 1 : 0);
            // }
            // NamedCard newCard = new NamedCard(name, type, strength, toughness, hasBastion, hasRipple, hasCleave);
            // System.out.println("Card " + (i+1) + ": " + newCard.toString());
            // deck.add(newCard);
        }
        if (!isValidDeck(deck)) {
            System.out.println("\tThe deck is invalid.");
            return buildUserDeck(sc);
        }
        return deck;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null) return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}

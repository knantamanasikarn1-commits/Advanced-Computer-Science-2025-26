public class CleanUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);
        String returnedString = "@" + firstName.toLowerCase() + "_" + lastName.toLowerCase() + "_";
        returnedString += (int) (Math.random() * 100 + 1950);
        return returnedString;
    }

    public static void cleanHome(Home home) {
        home.setCleanlinessLevel(validateCleanlinessLevel(home.getCleanlinessLevel() + 2));
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        String firstName = trimmedName.substring(0, trimmedName.indexOf(" "));
        String lastName = (trimmedName.substring(trimmedName.indexOf(" "))).trim();
        String fixedName = firstName + " " + lastName;
        return fixedName;
    }
}

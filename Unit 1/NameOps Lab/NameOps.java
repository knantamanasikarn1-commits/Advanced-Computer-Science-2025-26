public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(" + "\"" + name + "\"" + "): ";
    }
    
    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        }
        // Now this section has a first space, but not necessarily a second one
        String subNoFirstName = name.substring(indexOfFirstSpace(name) + 1, name.length());
        int secondSpaceSubIndex = subNoFirstName.indexOf(" ");
        if (secondSpaceSubIndex == -1) {
            return -1;
        }
        return secondSpaceSubIndex + indexOfFirstSpace(name) + 1;
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        return name.substring(0, indexOfFirstSpace(name));
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        }
        if (indexOfSecondSpace(name) == -1) {
            return name.substring(indexOfFirstSpace(name) + 1, name.length());
        }
        return name.substring(indexOfSecondSpace(name) + 1, name.length());
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) == -1 || indexOfSecondSpace(name) == -1) {
            return "";
        }
        return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
    }

    public static String generateLastFirstMidInitial(String name) {
        if (findMiddleName(name) != "") {
            return findLastName(name) + ", " + findFirstName(name) + " " + findMiddleName(name).charAt(0) + ".";
        }
        if (findLastName(name) != "") {
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findFirstName(name);
        
    }

}

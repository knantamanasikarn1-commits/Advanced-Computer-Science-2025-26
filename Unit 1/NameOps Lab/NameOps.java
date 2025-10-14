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
        String substring = name.substring(indexOfFirstSpace(name) + 1, name.length());
        int secondSpaceSubstringIndex = substring.indexOf(" ");
        if (secondSpaceSubstringIndex == -1) {
            return -1;
        }
        return secondSpaceSubstringIndex + indexOfFirstSpace(name) + 1;
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        return name.substring(0, indexOfFirstSpace(name));
    }

    public static String findLastName(String name) {
        return "";
    }

    public static String findMiddleName(String name) {
        return "";
    }

}

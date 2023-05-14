public class Zad4 {

    public static void main(String[] args) {

        String input = "Dupa";

        String output = allStars(input);

        System.out.println(output);

    }

    public static String allStars(String str) {
        // Base case: If the string has only one or zero characters, return it as is
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case: Combine the first character with the result of separating the remaining characters
        return str.charAt(0) + "*" + allStars(str.substring(1));
    }
}

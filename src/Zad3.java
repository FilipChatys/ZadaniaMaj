public class Zad3 {

    public static void main(String[] args) {
        String input = "examplxeXstringx";

        int count = countLowerCaseX(input);

        System.out.println("Number of lowercase 'x' characters: " + count);
    }

    public static int countLowerCaseX(String str) {
        if (str.isEmpty()) {
            return 0;  // Base case: an empty string contains no 'x' characters
        } else if (str.charAt(0) == 'x') {
            return 1 + countLowerCaseX(str.substring(1));  // If the first character is 'x', add 1 and recursively count the rest of the string
        } else {
            return countLowerCaseX(str.substring(1));  // If the first character is not 'x', recursively count the rest of the string
        }
    }
}

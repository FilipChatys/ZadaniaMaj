public class Zad12 {

    //Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
    // characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests
    // if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

        public static int sumDigits(String input) {
        int sum = 0;
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum = sum + Integer.parseInt(String.valueOf(c));
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        String input = "asgh1qq1qq990";
        int containsInteger = sumDigits(input);
        System.out.println(containsInteger);
    }

}

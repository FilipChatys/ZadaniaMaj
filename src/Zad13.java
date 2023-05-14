public class Zad13 {

    //We'll say that a "triple" in a string is a char appearing three times in a row.
    // Return the number of triples in the given string. The triples may overlap.

    public static int countStringTriples(String input) {
        int count = 0;

        for (int i = 0; i < input.length() - 2; i++) {

            char currentChar = input.charAt(i);

            if (currentChar == input.charAt(i + 1) && currentChar == input.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "aaabbbcccddedddXXXXwert555";
        int tripleCount = countStringTriples(input);
        System.out.println("Ilość trójek: " + tripleCount);
    }


}


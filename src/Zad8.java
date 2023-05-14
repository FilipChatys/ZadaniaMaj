public class Zad8 {

    public static String repeatEnd(String input, int n) {
        int length = input.length();
        String lastNCharacters = input.substring(length - n, length);
        StringBuilder repeatedString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            repeatedString.append(lastNCharacters);
        }
        return repeatedString.toString();
    }

    public static void main(String[] args) {
        String input = "Dupa";
        int n = 2;

        String repeatedString = repeatEnd(input, n);
        System.out.println(repeatedString);
    }
}

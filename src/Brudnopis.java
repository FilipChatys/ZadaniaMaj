public class Brudnopis {

    public static void main(String[] args) {
        String input = "aaabbcbcbcbabab";
        String output = reduceString(input);
        System.out.println(output);
    }

    public static String reduceString(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean reductionMade = true;

        while (reductionMade) {
            reductionMade = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                char currentChar = sb.charAt(i);
                char nextChar = sb.charAt(i + 1);

                if (currentChar == 'a' && nextChar == 'b' || currentChar == 'b' && nextChar == 'a') {
                    sb.replace(i, i + 2, "c");
                    reductionMade = true;
                    break;
                } else if (currentChar == 'a' && nextChar == 'c' || currentChar == 'c' && nextChar == 'a') {
                    sb.replace(i, i + 2, "b");
                    reductionMade = true;
                    break;
                } else if (currentChar == 'b' && nextChar == 'c' || currentChar == 'c' && nextChar == 'b') {
                    sb.replace(i, i + 2, "a");
                    reductionMade = true;
                    break;
                }
            }
        }

        return sb.toString();
    }
}



/*

public class Zad11 {

    //Na wejściu program dostaje dowolny string który składa się tylko
    // z liter a, b i c np. aaabbcbcbcbabab. Program ma zrobić redukcję tego stringa. Jak działa
    // redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane
    // jest na a. Program ma redukować stringa maksymalnie jak się da.
    // Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a. Program wyświetla a.


    public static String reduceString(String input) {
        StringBuilder sb = new StringBuilder(input);

        int length = sb.length();

            //for (int i = 0; i < length - 1; i++) {
                char currentChar = sb.charAt(0);
                char nextChar = sb.charAt(1);

                if ((currentChar == 'a' && nextChar == 'b') || (currentChar == 'b' && nextChar == 'a')) {
                    String zmienna1 = "c";
                    //currentChar = sb.charAt(sb.indexOf(zmienna1));
                    sb.replace(sb.indexOf("a"), sb.indexOf("b"), zmienna1);
                    sb.deleteCharAt(sb.indexOf(zmienna1)+1);
                    return reduceString(String.valueOf(sb.substring(1)));
                } else if ((currentChar == 'a' && nextChar == 'c') || (currentChar == 'c' && nextChar == 'a')) {
                    String zmienna2 = "b";
                    currentChar = sb.charAt(sb.indexOf(zmienna2));
                    sb.replace(sb.indexOf("a"), sb.indexOf("c"), zmienna2);
                    sb.deleteCharAt(sb.indexOf(zmienna2)+1);
                    return reduceString(String.valueOf(sb.substring(1)));
                } else if ((currentChar == 'b' && nextChar == 'c') || (currentChar == 'c' && nextChar == 'b')) {
                    String zmienna3 = "a";
                    currentChar = sb.charAt(sb.indexOf(zmienna3));
                    sb.replace(sb.indexOf("b"), sb.indexOf("c"), zmienna3);
                    sb.deleteCharAt(sb.indexOf(zmienna3)+1);
                    return reduceString(String.valueOf(sb.substring(1)));
                } else {
                    return reduceString(String.valueOf(sb.substring(1)));
                }
        //return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcbcbcbabab";
        String reducedString = reduceString(input);
        System.out.println("Reduced string: " + reducedString);
    }
}

*/


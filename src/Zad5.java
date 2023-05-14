public class Zad5 {
    public static void main(String[] args) {
        int decimalNumber = 10;

        String binaryNumber = decimalToBinary(decimalNumber);

        System.out.println("Liczba binarna: " + binaryNumber);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int remainder = decimal % 2;
            int quotient = decimal / 2;
            return decimalToBinary(quotient) + Integer.toString(remainder);
        }
    }
}

public class Zad1 {

    public static void main(String[] args) {
        int bunnyCount = 3; // Change this value to test with different number of bunnies
        int totalEars = countEars(bunnyCount);
        System.out.println("Suma uszu " + totalEars + " dla " + bunnyCount + " zajecy. ");
    }

    public static int countEars(int n) {
        if (n == 0) {
            return 0; // Base case: no bunnies, no ears
        } else if (n % 2 == 0) {
            return 3 + countEars(n - 1); // Even bunnies have 3 ears
        } else {
            return 2 + countEars(n - 1); // Odd bunnies have 2 ears
        }
    }

}
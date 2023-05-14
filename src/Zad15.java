public class Zad15 {

    public static int countClumps(int[] array) {
        int clumps = 0;
        boolean isClump = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                if (!isClump) {
                    clumps++;
                    isClump = true;
                }
            } else {
                isClump = false;
            }
        }
        return clumps;
    }

    public static void main(String[] args) {
        int[] input= {1,2,2,3,3,3,3,3,3};

        System.out.println(countClumps(input));
    }
}


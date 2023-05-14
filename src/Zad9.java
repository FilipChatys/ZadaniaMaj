public class Zad9 {

    public static boolean isXYZMiddle(String str) {
        int length = str.length();
        if (length <= 3) {
            return false; // "xyz" cannot be in the middle of a string with less than 3 characters
        }

        int startIndex = length / 2 - 2; // Starting index to search for "xyz"
        if (length % 2 == 0) {
            return str.substring(startIndex, startIndex + 3).equals("xyz")
                    || str.substring(startIndex + 1, startIndex + 4).equals("xyz");
        } else {
            return str.substring(startIndex + 1, startIndex + 4).equals("xyz");
        }
    }

    public static void main(String[] args) {
        // Test the method
        System.out.println(isXYZMiddle("AAxyzBB"));
        System.out.println(isXYZMiddle("AAxyzBBB"));
        System.out.println(isXYZMiddle("xyzAAxyzBB"));
        System.out.println(isXYZMiddle("xyz"));
        System.out.println(isXYZMiddle("AAxyz"));
        System.out.println(isXYZMiddle("xyzBB"));
        System.out.println(isXYZMiddle("ABxyzC"));
        System.out.println(isXYZMiddle("axyzbb"));
    }
}


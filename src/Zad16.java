public class Zad16 {

    public static boolean canBallance(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5};
        int[] nums2 = {1, 1, 2, 1, 1, 9};
        int[] nums3 = {1, 1, 1, 0, 1, 2};
        boolean canSplit = canBallance(nums);
        boolean canSplit2 = canBallance(nums2);
        boolean canSplit3 = canBallance(nums3);

        System.out.println("Can split the array: " + canSplit);
        System.out.println("Can split the array2: " + canSplit2);
        System.out.println("Can split the array3: " + canSplit3);
    }


}

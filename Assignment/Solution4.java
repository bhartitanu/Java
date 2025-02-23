public class Solution4 {
    public static boolean isDistict(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 9, 1 };
        System.out.println("The element of array are distinct :" + isDistict(nums));
    }

}
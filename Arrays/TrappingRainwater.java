public class TrappingRainwater {
    public static int trapwater(int height[]) {
        int n = height.length;

        // leftmax array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
            // System.out.println(leftmax[i]);
        }

        // rightmax array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
            // System.out.println(rightmax[i]);
        }

        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel=min(leftmax-rghtmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water=waterlevel-height[i];
            trappedwater += (waterlevel - height[i]);
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // trapped water
        System.out.println("Total water trapped is: " + trapwater(height));
    }
}
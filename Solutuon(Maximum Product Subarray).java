class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProduct = nums[0]; // Stores the maximum product found
        int currMax = nums[0]; // Max product at current index
        int currMin = nums[0]; // Min product at current index

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
    }
}

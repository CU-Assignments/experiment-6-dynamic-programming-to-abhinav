class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0; // Tracks the farthest index we can reach
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond what we can reach, return false
            if (i > reachable) {
                return false;
            }
            // Update the farthest index we can reach
            reachable = Math.max(reachable, i + nums[i]);
            // If the farthest index reaches or exceeds the last index, return true
            if (reachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true; // If we complete the loop, the last index is reachable
    }
}

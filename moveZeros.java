class Solution {
    public void moveZeroes(int[] nums) {
        // loop through array
        for (int i = 0; i < nums.length; i++) {
            // if encounter 0
            if (nums[i] == 0) {
                // create inner loop
                int j = i;
                // find next non-zero slot
                while (nums[j] == 0 && j < nums.length - 1) {
                    j++;
                }
                // swap
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}

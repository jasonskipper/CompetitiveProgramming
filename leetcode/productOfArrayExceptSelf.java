class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // get size of nums 
        int n = nums.length;
        
        // create left, right, and output arrays of size n 
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        
        // set index 0 of left to 1 
        // set index n-1 of right to 1 
        left[0] = 1;
        right[n-1] = 1;
        
        // populate left    
        for(int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        // populate right 
        for(int i = n-2; i > -1; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        // multiply left and right at the same indices 
        for(int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
        
        
        
        
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        
//         O(n^3)
//         int maximumSubArraySum = Integer.MIN_VALUE; // -2^31  
        
//         for(int left = 0; left < nums.length; left++) {
//             for(int right = left; right < nums.length; right++) {
//                 int currentSum = 0;
//                 for(int currentwindow = left; currentwindow <= right; currentwindow++) {
//                     currentSum += nums[currentwindow];
//                 }
//                 maximumSubArraySum = Math.max(maximumSubArraySum, currentSum);
//             }
//         }
//         return maximumSubArraySum;
        
//         O(n^2) 
//         int maximumSubArraySum = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++) {
//             int currentsum = 0;
//             for(int j = i; j < nums.length; j++) {
//                 currentsum += nums[j];
//                 maximumSubArraySum = Math.max(maximumSubArraySum, currentsum);
//             }
//         }
//         return maximumSubArraySum;
        
       
//         O(n)  
        int currentsum = nums[0];
        int bestsum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            bestsum = Math.max(bestsum + nums[i], nums[i]);
            currentsum = Math.max(currentsum, bestsum);
        }
        return currentsum;
    }
}

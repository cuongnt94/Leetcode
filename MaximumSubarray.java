/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.*/

/*
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

public int maxSubArray(int[] nums) {
    int result = nums[0];
    int sum = nums[0];
 
    for(int i=1; i<nums.length; i++){
        sum = Math.max(nums[i], sum + nums[i]);
        result = Math.max(result, sum);
    }
 
    return result;
}

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
class Solution
{

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i =0; i < nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    
}

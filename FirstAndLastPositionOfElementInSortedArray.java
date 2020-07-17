/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right)
        {
            int mid = (left + right) / 2;
            
            if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        
        int first = left;
        if(left < nums.length && nums[left] == target)
        {
            left = 0;
            right = nums.length - 1;
            
            
            while(left < right)
            {
                int mid = (left + right + 1)/2;
                
                if(nums[mid] > target)
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid;
                }
            }
            
            return new int[] {first, right};
        }
        else
        {
            return new int[] {-1, -1};
        }
    }
}

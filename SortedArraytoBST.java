/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/
import java.util.*;

class TreeNode
{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right)
      {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = helper(nums, 0, nums.length);
        return root;
    }

    public TreeNode helper(int[] nums, int start, int end)
    {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, start, mid -1);
        root.right = helper(nums, mid +1, end);
        return root;
    }

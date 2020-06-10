//Given a collection of distinct integers, return all possible permutations.

import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        for(int i =0; i < num.length; i++)
        {
            ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
            for(int j = 0; j < result.size(); j++)
            {
                ArrayList<Integer> sub = result.get(j);

                for(int k = 0; k < sub.size()+1; k++)
                {
                    sub.add(k, num[i]);
                    ArrayList<Integer> temp_of_sub = new ArrayList<>(sub);
                    temp.add(temp_of_sub);
                    sub.remove(k);
                }
            }

            result = new ArrayList<>(temp);
        }

        return result;
    }

    public static void main(String[] args)
    {
        Solution x = new Solution();
        int[] nums = { 1 , 2, 3};
        ArrayList<ArrayList<Integer>> ans = x.permute(nums);
        for(int i =0; i < ans.size(); i++)
        {
            List<Integer> temp = ans.get(i);
            for(int j =0; j < temp.size(); j++)
            {
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }


    }
}

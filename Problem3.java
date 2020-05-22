/*
Given a string, find the length of the longest substring without repeating characters.
*/

import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if(s.equals(" "))
            return 1;

        for(int i =0; i < s.length(); i++)
        {
            for(int j = i+1; j <s.length(); j++)
            {
                String temp = s.substring(i,j);
                if (checkConsistency(temp))
                {
                    int cur_length = temp.length();
                    if(max < cur_length)
                        max = cur_length;
                }
            }
        }
        return max;
    }

    public boolean checkConsistency(String s)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i < s.length(); i++)
        {
            set.add(s.charAt(i));
        }
        if(set.size() != s.length())
            return false;
        return true;
    }

    public static void main(String[] args)
    {
        Solution x = new Solution();
        String s = "bbbbb";

        System.out.println(x.lengthOfLongestSubstring(s));
    }
}

/**
 * leetcode problem link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Runtime : 6ms faster than 80% submissions
 * Memory : 39.7MB better than 74%
 */

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length()==1)
            return 1;
        HashSet set = new HashSet();
        
        int max=0;
        int l=0;
        int r=0;
        
        while(r<s.length())
        {
                        
            char c = s.charAt(r);
            
            if(! set.add(c))
            {
                max=java.lang.Math.max(max, set.size());
                
                while(s.charAt(l)!=c)
                {
                    set.remove(s.charAt(l++));
                }                
                set.remove(s.charAt(l++));
            }
            else
                r++;
            
        }
        
        max=java.lang.Math.max(max, set.size());
        return max;
    }
}
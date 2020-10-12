/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Link: https://leetcode.com/problems/trapping-rain-water/
Solution complexity:O(n)
Approach: Using prefix and suffix arrays
*/


class Solution {
public:
    int trap(vector<int>& height) {
        int n=height.size();
        if(n==0||n==1)
            return 0;
            
        int pre[n],post[n];
        int i;
        pre[0]=height[0];
        for(i=1;i<n;i++)
        {
            pre[i]=max(pre[i-1],height[i]);
        }
        post[n-1]=height[n-1];
        for(i=n-2;i>=0;i--)
        {
            post[i]=max(post[i+1],height[i+1]);
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            count=count+max(min(post[i],pre[i])-height[i],0);
        }
        return count;
        
    }
};
package Basics.BinarySearch;

/**
 * Binary Search RightMost Element is a modified Binary Search to find the Right-most index of an element,
 * occuring in a sorted array of integers, for arrays with unique values this functions as a normal binary search.
 * For sorted arrays with repeating elements this algorithm finds the Right most index for the given integer if it exists else returns -1.
 * 
 * For example : Given [1,1,1,2,2,3,4,5,5,5,6,6] and target:5
 * It will return 9.
 */

public class BinarySearchRightMostElement 
{
    // Given an array of ints and a target return the RightMost index of the target else -1

    public static int binSearchRightMost(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length;
        int mid = 0;
                
        while(l<r)
        {
            mid = l + (r-l)/2;

            if(nums[mid] > target)
                r = mid;                
            else
                l = mid+1;
        }
        return nums[r-1]==target ? r-1 : -1;
    }    
}
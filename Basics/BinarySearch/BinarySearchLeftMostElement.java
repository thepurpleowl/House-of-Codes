package Basics.BinarySearch;


/**
 * Binary Search LeftMost Element is a modified Binary Search to find the left-most index of an element,
 * occuring in a sorted array of integers, for arrays with unique values this functions as a normal binary search.
 * For sorted arrays with repeating elements this algorithm finds the left most index for the given integer if it exists else returns -1.
 * 
 * For example : Given [1,1,1,2,2,3,4,5,5,5,6,6] and target:5
 * It will return 7.
 */

public class BinarySearchLeftMostElement
{
    // Given an array of ints and a target return the leftmost index of the target else -1

    public static int binSearchLeftMost(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length;
        int mid = 0;
        
        

        while(l<r)
        {
            mid = l + (r-l)/2;

            if(nums[mid] < target)
                l = mid+1;
            else
                r = mid;            
        }
        return nums[l]==target ? l : -1;
    }    
}
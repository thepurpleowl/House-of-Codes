// Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input:  [1,2,3,4]
// Output: [24,12,8,6]
// Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

// Note: Please solve it without division and in O(n).

// Follow up:
// Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

// /**
//  * @param {number[]} nums
//  * @return {number[]}
//  */
var productExceptSelf = function (nums) {
  let rightProduct = [];
  let leftProduct = [];
  let n = nums.length;
  rightProduct[n - 1] = 1;
  leftProduct[0] = 1;
  for (let i = n - 2; i >= 0; i--) {
    rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
  }
  for (let j = 1; j < n; j++) {
    leftProduct[j] = nums[j - 1] * leftProduct[j - 1];
  }
  for (let index in nums) {
    nums[index] = rightProduct[index] * leftProduct[index];
  }
  return nums;
};

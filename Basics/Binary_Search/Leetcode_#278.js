/* First Bad Version
 * Binary Search
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 * Example:
 *
 * Given n = 5, and version = 4 is the first bad version.
 *
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 *
 * Then 4 is the first bad version.
 *
 * @format
 */

var solution = function (isBadVersion) {
  return function (n) {
    let first = 1;
    let last = n;

    while (first < last) {
      let middle = first + Math.floor((last - first) / 2);

      if (!isBadVersion(middle)) {
        first = middle + 1;
      } else {
        last = middle;
      }
    }

    return first;
  };
};

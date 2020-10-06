/* 
Given an integer N, compute & return square root of N. If N is not perfect square return floor(sqrt(N))

Note: Do it without using sqrt function from std library
Range of N : 1 <= N <=10^9

Use Binary Search

Intuition : 

1 ---------- x ----------- N  (x is in this range)

if x^2 == N return x;

if x^2 < N then any value < x cannot be the answer. The range [x..n) could be one answer. 

if x^2 > N then any value > x cannot be the answer. Look to our left and ignore x also because x^2 > N

Time complexity : O(log2n)
*/

#include <iostream>
using namespace std;

int _sqrt(int x) {
	if(x==0)
		return 0;
	int low = 1, high = x, ans;
	while(low <= high) {
		int mid = low + (high - low)/2;
		if(mid == x/mid)
		{
			ans = mid;
			break;
		}
		if(mid < x/mid){	
		//mid < x/mid instead of mid*mid <= x to prevent overflow
			ans = mid;
			low = mid + 1;
		}
		else
			high = mid - 1;
	}
	return ans;
}

int main() {
	int n;
	cout<<"Enter number : ";
	cin>>n;
	int result = _sqrt(n);
	cout<<"Square root is : "<<result<<endl;
	return 0;
}

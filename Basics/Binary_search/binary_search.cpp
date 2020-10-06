//Time Complexity: O(logn)
#include <bits/stdc++.h> 
using namespace std; 

int binarySearch(int arr[], int l, int r, int x) 
{ 
    while (l <= r) { 
        int mid = l + (r - l) / 2; 
  
        
        if (arr[mid] == x)
        {
            return mid; 
        }
  
        
        if (arr[mid] < x) 
        {
            l = mid + 1;
        }
  
       
        else
        {
            r = mid - 1; 
        }
    } 
  
   
    return -1; //reaches this condition if element is not present
} 
  
int main() 
{ 
    int size;
    cin>>size;
    int arr[size];
    int i,x;
    for(i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    cin>>x;
    int result = binarySearch(arr, 0, size - 1, x); 
    if (result == -1) 
    cout << "Element is not present in array"<<endl;
    else
    cout << "Element is present at index " << result<<endl; 
    return 0; 
} 
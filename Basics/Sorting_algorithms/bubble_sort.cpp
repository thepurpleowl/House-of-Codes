//Time Complexity: O(n^2)
#include <bits/stdc++.h> 
using namespace std; 
  
void swap(int *xp, int *yp)  
{  
    int temp = *xp;  
    *xp = *yp;  
    *yp = temp;  
}  
  

void bubbleSort(int arr[], int n)  
{  
    int i, j;  
    for (i = 0; i < n-1; i++) 
    {
      for (j = 0; j < n-i-1; j++) 
      {
        if (arr[j] > arr[j+1])  
        {
            swap(&arr[j], &arr[j+1]);  
        }
      }
    }
}  
 
  

int main()  
{  
    int size;
    cin>>size;
    int arr[size];  
    int i;
    for(i=0;i<size;i++)
    {
        cin>>arr[i];
    }
   
    bubbleSort(arr, size);  
    cout<<"Sorted array: \n";  
    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;  
}  
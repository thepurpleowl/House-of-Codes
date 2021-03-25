#include<bits/stdc++.h>
#include<string>
#define int long long
using namespace std;
 
void fun(int n)
{
 
    int dig = n%10;
 
    int clicks = (dig-1)*10;
    clicks++;
 
    int i=dig;
    string a = to_string(dig);
    int num = i;
 
    while(num!=n)
    {
        a = a + to_string(i);
 
        stringstream str(a);
        int x = 0; 
        str >> x; 
        num = x;
 
        clicks+= a.size();
    }
 
    cout<<clicks<<endl;
}
 
int32_t main()
 {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
 
     int queries;
     cin>>queries;
     
     while(queries--)
     {
         int n;
         cin>>n;
         
         fun(n);
     }
 
	return 0;
}

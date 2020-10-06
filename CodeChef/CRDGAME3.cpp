#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        double c,r;
        cin>>c>>r;
        double a,b;
        a=ceil(c/9);
        b=ceil(r/9);
        if(a==b)
        {
            cout<<"1"<<" "<<a<<"\n";
        }
         if(a<b)
        {
            cout<<"0"<<" "<<a<<"\n";
        }
         if(a>b)
        {
            cout<<"1"<<" "<<b<<"\n";
        }
    }
    return 0;
}
#include<bits/stdc++.h>
using namespace std;

#define ibs ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define pb push_back
#define mk make_pair
#define f(i,k,n) for(int i=k;i<n;i++)
#define fe(i,k,n) for(int i=k;i<=n;i++)
#define ll long long int

void solve(){
    int n,k,*a;
    ll total = 0, totalK = 0;
    cin>>n>>k;
    a = new int[n];
    f(i,0,n){
        cin>>a[i];
        total += a[i];
        if(a[i]>k)
            totalK += k;
        else
            totalK += a[i];
    }
    cout<<(total - totalK)<<"\n";
}

int main(){
    ibs
    int t;
    cin>>t;
    while(t--){
        solve();
    }
    return 0;
}

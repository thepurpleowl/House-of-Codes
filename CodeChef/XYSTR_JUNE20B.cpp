#include<bits/stdc++.h>
using namespace std;

#define ibs ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define pb push_back
#define mk make_pair
#define f(i,k,n) for(int i=k;i<n;i++)
#define fe(i,k,n) for(int i=k;i<=n;i++)
#define ll unsigned long long int

void solve(){
    string s;
    cin>>s;
    const int n = s.size();
    int left = 0, right = 0;
    
    f(i,0,n-1){
        if(s[i]=='x' && s[i+1]=='y'){
            left++;
            i += 1;
        }
        else if(s[i]=='y' && s[i+1]=='x'){
            left++;
            i += 1;
        }        
    }

    f(i,1,n-1){
        if(s[i]=='x' && s[i+1]=='y'){
            right++;
            i += 1;
        }
        else if(s[i]=='y' && s[i+1]=='x'){
            right++;
            i += 1;
        }
    }

    cout<<max(left, right)<<"\n";
}

int main(){
    ibs
    int t ;
    cin>>t;
    while(t--){
        solve();
    }
    return 0;
}

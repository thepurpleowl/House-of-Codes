#include<bits/stdc++.h>
using namespace std;

#define ibs ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define pb push_back
#define mk make_pair
#define f(i,k,n) for(int i=k;i<n;i++)
#define fe(i,k,n) for(int i=k;i<=n;i++)
#define ll unsigned long long int

void solve(){
	int n;
	cin>>n;
	int a[n][n];
	int count = 1;
	f(i,0,n)
		f(j,0,n)
			a[i][j] = count++;

	if(n%2==0)
		f(i,0,n)
			if(i%2==1)
				f(j,0,n/2)
					swap(a[i][j], a[i][n-j-1]);

	f(i,0,n){
		f(j,0,n)
			cout<<a[i][j]<<" ";
		cout<<"\n";
	}
	
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

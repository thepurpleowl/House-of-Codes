#include<iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	// your code goes here
	int t;
	cin>>t;
	for(int i=0;i<t;i++){
	    int n,m, count = 0;
	    cin>>n>>m;
	    int cn = (n-1)/4;
        int cm = m/4;
        if((n-1)%4>=2){
            cn++;
        }
        if(m%4>=2){
            cm++;
        }
        cout<<m-n+1-cm+cn<<endl;
	}
	return 0;
}


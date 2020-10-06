#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    unordered_map<int,int> m;
	    bool res=true;
	    while(n--){
	        int temp;
	        cin>>temp;
	        if(temp==5){
	            m[5]++;
	        }
	        else if(temp==10)
	        {
	            if(m[5]==0){
	                res=false;
	            }
	            m[5]--;
	            m[10]++;
	        }
	        else{
	            if(m[10]==0 && m[5]<2){
	                res=false;
	            }
	            m[15]++;
	            if(m[10]>0)
	                m[10]--;
	           else
	                m[5]-=2;
	        }
	        
	    }
	    if(res)
	        cout<<"YES"<<endl;
	   else
	        cout<<"NO"<<endl;
	}
	return 0;
}

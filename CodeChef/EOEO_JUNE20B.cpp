using namespace std;

#define ibs ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define pb push_back
#define mk make_pair
#define f(i,k,n) for(int i=k;i<n;i++)
#define fe(i,k,n) for(int i=k;i<=n;i++)
#define ll unsigned long long int

void solve(){
    ll ts, count;
    cin>>ts;

    count = 0;
    bitset<70> bits(ts);
    int lowest = 1<<bits._Find_first() + 1;
    
    count = ts/lowest;
    
    cout<<count<<"\n";
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

// @yashsoni501

#include<bits/stdc++.h>
using namespace std;
 
#define ll long long
#define ff first
#define ss second
#define pb push_back
#define pf push_front
#define mp make_pair
#define pu push
#define pp pop_back
#define in insert
#define MOD 1000000007
#define endl "\n"
#define sz(a) (int)((a).size())
#define all(x) (x).begin(), (x).end()
#define trace(x) cerr << #x << ": " << x << " " << endl;
#define prv(a) for(auto x : a) cout << x << ' ';cout << '\n';
#define IOS ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define OTP(s) cout<<s<<endl;
#define FOR(i,j,k,l) for(int i=j;i<k;i+=l)
#define REP(i,j) FOR(i,0,j,1)
inline ll add(ll a, ll b){a += b; if(a >= MOD)a -= MOD; return a;}
inline ll sub(ll a, ll b){a -= b; if(a < 0)a += MOD; return a;}
inline ll mul(ll a, ll b){return (ll)((ll) a * b %MOD);}
typedef vector<ll> vl;
typedef vector<vl> vvl;
typedef pair<ll,ll> pll;
typedef vector<pll> vpll;

ll min(ll a,ll b)
{
    return a>b?b:a;
}
ll max(ll a,ll b)
{
    return a>b?a:b;
}

ll t,n,k,ar[100];
set<ll> st;
vl vt;
int main()
{
    IOS
    cin>>t;
    while(t--)
    {
        st.clear();
        vt.clear();
        cin>>n>>k;
        REP(i,n)
        {
            cin>>ar[i];
        }
        ll ma = *max_element(ar,ar+n);
        ll id = 1;
        // vt.pb(1);
        while(id<=ma)
        {
            vt.pb(id);
            id*=k;
        }
        bool boo=1;
        REP(i,n)
        {
            while(ar[i]>0)
            {
                auto tm = upper_bound(all(vt),ar[i]);
                if(st.find(tm - vt.begin()-1)!=st.end())
                {
                    boo=0;
                    break;
                }
                st.insert(tm-vt.begin()-1);
                ar[i]-=vt[tm-vt.begin()-1];

            }
            if(ar[i]!=0)    boo=0;
        }
        if(boo) cout<<"YES\n";
        else
        {
            cout<<"NO\n";
        }
        
    }
}

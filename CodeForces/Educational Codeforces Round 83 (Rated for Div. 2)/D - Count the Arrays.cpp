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
#define MOD 998244353
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

long long binpow(long long a, long long b, long long m) {
    a %= m;
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res;
}

ll min(ll a,ll b)
{
    return a>b?b:a;
}
ll max(ll a,ll b)
{
    return a>b?a:b;
}
ll n,m;
ll factorial[300000];
ll inv[300000];

long long binomial_coefficient(int x, int y) 
{
    ll a = 1;
    for(int i=x;i>x-y;i--)
    {
        a = mul(a,i);
    }    

    for(int i=1;i<=y;i++)
    {
        a = mul(a,inv[i]);
    }
    return a;
}
int main()
{
    IOS
    cin>>n>>m;
    factorial[0] = 1;
    inv[1] = 1;
    for(int i = 2; i < m; ++i)
    inv[i] = (MOD - (MOD/i) * inv[MOD%i] % MOD) % MOD;
    REP(i,m+5)
    {
        if(!i)  continue;
        factorial[i] = mul(factorial[i-1],i);
    }
    ll ans = n-2;
    if(n==2)
    {
        cout<<0<<endl;
        return 0;
    }
    ans = mul(ans,binpow(2,n-3,MOD));
    ans = mul(ans,binomial_coefficient(m,n-1));
    cout<<ans<<endl;
}

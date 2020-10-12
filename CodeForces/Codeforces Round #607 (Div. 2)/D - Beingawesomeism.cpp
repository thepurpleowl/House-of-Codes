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

ll t,r,c;
char ar[100][100];
int main()
{
    IOS
    cin>>t;
    while(t--)
    {
        cin>>r>>c;
        REP(i,r)
            REP(j,c)
            {
                cin>>ar[i][j];
            }
        ll cnt = 0;
        REP(i,r)
        {
            REP(j,c)
            {
                if(ar[i][j]=='A')
                {
                    cnt++;
                }
            }
        }
        if(cnt == r*c)
        {
            cout<<0<<endl;
            continue;
        }
        if(cnt==0)
        {
            cout<<"MORTAL\n";
            continue;
        }
        bool a=1;
        REP(i,r)
        {
            if(ar[i][0]=='P')
            {
                a=0;
                break;
            }
        }
        if(a)
        {
            cout<<1<<endl;
            continue;
        }
        a=1;
        REP(i,r)
        {
            if(ar[i][c-1]=='P')
            {
                a=0;
                break;
            }
        }
        if(a)
        {
            cout<<1<<endl;
            continue;
        }
        a=1;
        REP(i,c)
        {
            if(ar[0][i]=='P')
            {
                a=0;
                break;
            }
        }
        if(a)
        {
            cout<<1<<endl;
            continue;
        }
        a=1;
        REP(i,c)
        {
            if(ar[r-1][i]=='P')
            {
                a=0;
                break;
            }
        }
        if(a)
        {
            cout<<1<<endl;
            continue;
        }
        if(ar[0][0]=='A' || ar[0][c-1]=='A' || ar[r-1][0] == 'A' || ar[r-1][c-1]=='A')
        {
            cout<<2<<endl;
            continue;
        }
        a=1;
        REP(i,r)
        {
            a=1;
            REP(j,c)
            {
                if(ar[i][j]=='P')
                {
                    a=0;
                    break;
                }
            }
            if(a)
                break;
        }
        if(a)
        {
            cout<<2<<endl;
            continue;
        }
        REP(i,c)
        {
            a=1;
            REP(j,r)
            {
                if(ar[j][i]=='P')
                {
                    a=0;
                    break;
                }
            }
            if(a)
                break;
        }
        if(a)
        {
            cout<<2<<endl;
            continue;
        }
        a=0;
        REP(i,r)
        {
            if(ar[i][0]=='A'||ar[i][c-1]=='A')
                a=1;
        }
        REP(i,c)
        {
            if(ar[0][i]=='A'||ar[r-1][i]=='A')
                a=1;
        }
        if(a)
        {
            cout<<3<<endl;
            continue;
        }
        else
        {
            cout<<4<<endl;
        }
        
    }
}

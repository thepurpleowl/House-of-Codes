//Time Complexity: O(V+E) where V is number of nodes and E is edges
//Space Complexity: O(V)
#include<bits/stdc++.h>
using namespace std;

/*Add undirected edges to the graph*/
void addedge(int x, int y, vector<vector<int>> &nodes)
{
    nodes[x].push_back(y);
    nodes[y].push_back(x);
}
void DFSUtil(vector<vector<int>> &nodes, int i,vector<bool> &vis)
{
    vis[i]=true;
    cout<<i<<" ";
    for(int j=0; j<nodes[i].size(); j++)
    {
        if(!vis[nodes[i][j]])
            DFSUtil(nodes, nodes[i][j], vis);
    }
}
/*Function that calls on DFSUtil to perform Depth first search*/
void DFS(vector<vector<int>> &nodes, int src, int v)
{
    vector<bool> vis(v, false);
    vis[src]=true;
    cout<<src<<" ";
    for(int i=0; i<nodes[src].size(); i++)
    {
        if(!vis[nodes[src][i]])
            DFSUtil(nodes, i, vis);
    }
}
int main()
{
    int v, e;//number of nodes (numbered from 0 to v-1) and number of edges
    cin>>v>>e;
    vector<vector<int>> nodes(v);
    for(int i=0; i<e; i++)
    {
        int x, y;
        cin>>x>>y;
        addedge(x,y, nodes);
    }
    cout<<"Enter source vertex: ";
    int src;//Source vertex
    cin>>src;
    DFS(nodes, src, v);

}
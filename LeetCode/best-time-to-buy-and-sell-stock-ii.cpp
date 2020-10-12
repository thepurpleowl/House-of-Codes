class Solution {
public:
    
    int maxProfit(vector<int>& a) {
        
        bool inp = false;
        int profit = 0,curr;
        int n = a.size();
        
        for(int i=0;i<n-1;i++){
            if(inp){
                if(a[i+1]<a[i]){
                    inp = false;
                    profit += (max(0,a[i]-curr));
                }
            }else{
                if(a[i+1]>a[i]){
                    inp = true;
                    curr = a[i];
                }
            }
        }
        if(inp){
            profit += (max(0,a[n-1]-curr));
        }
        
        return profit;
        
    }
};

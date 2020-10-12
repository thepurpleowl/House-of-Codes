class Solution {
public:
    bool isHappy(int n) {
        unordered_map<int, int> um;
        
        int y;
        vector<int> v;
        
        while(true){
            y = 0;
            v.clear();
            int x=n;

            if(um[n]!=0)
                break;
            
            for(;x!=0;x/=10)
                v.push_back(x%10);
        
            for(auto it:v)
                y += it*it;
            if(y==1)
                break;

            um[n] = y;
            n=y;
        }
        
        if(y==1)
            return true;
        else
            return false;
        
        
    }
};

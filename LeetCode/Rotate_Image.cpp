class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(i=0;i<n;i++)
        {
            int j=0,l=n-1;
            while(j<l)
            {
                swap(matrix[i][j],matrix[i][l]);
                    j++;l--;
            }
        }
        
    }
};

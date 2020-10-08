
/**
 * Given 2D Array of m rows and n cols, find total number of unique paths from top-left(0,0) to bottom-right(m,n)
 * Leetcode link : https://leetcode.com/problems/unique-paths/
 * Runtime: 0ms faster than 100% submissions
 * Memory : 36.6 MB better than 72.43% submissions  
 */

public class UniquePaths 
{
    public int uniquePaths(int m, int n) 
    {
        if(m==1 || n==1)
            return 1;
        int cols = m;
        int rows = n;
        
        int[][] grid = new int[rows][cols];
        grid[0][0] = 1;
        
        for(int i=0; i<rows; i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(check(j-1,cols))                
                    grid[i][j] +=grid[i][j-1];                 
                if(check(i-1,rows))
                    grid[i][j]+=grid[i-1][j];
            }
        }
        
        return grid[rows-1][cols-1];
    }
    
    //helper function to check for index within bounds
    public static boolean check(int n , int len)
    {
        return 0<=n && n<len;
    }    
}
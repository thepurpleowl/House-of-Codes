/**
 * Given a 2 dimensional Array of m rows and n cols Return the minimal sum of path from top left cell (i.e (0,0)) to the bottom-right cell (m,n)
 * Problems related to this : https://leetcode.com/problems/minimum-path-sum/
 * Runtime : 1ms faster than 99.87% submissions
 * Memory : 42MB better than 60% submissions
 */


public class MinimumPathSum {
    
public int minPathSum(int[][] grid)
    {
        int ylen = grid.length;
        int xlen = grid[0].length;                               
        int[][] dp = new int[ylen][xlen];                
        dp[0][0] = grid[0][0];
        
        for(int y=0; y<ylen; y++)
        {
            for(int x=0; x<xlen; x++)
            {
                traverse(x,y,xlen,ylen,grid,dp);
            }
        }
        
        return dp[ylen-1][xlen-1];
        
    }
            
    public static void traverse(int x, int y, int xlen, int ylen, int[][]grid, int[][]dp)
    {
        if(check(x+1,xlen))
        {
            if(dp[y][x+1]==0)
                dp[y][x+1] = dp[y][x]+grid[y][x+1];
            else
                dp[y][x+1] = Math.min(dp[y][x+1],dp[y][x]+grid[y][x+1]);                
        }
        
        if(check(y+1,ylen))
        {
            if(dp[y+1][x]==0)
                dp[y+1][x] = dp[y][x] + grid[y+1][x];
            else
                dp[y+1][x]= Math.min(dp[y+1][x],dp[y][x] + grid[y+1][x]);
        }
    }
    
    //helper function to check for index within bounds
    public static boolean check(int x, int n)
    {
        return x<n && x>=0;
    }                
}
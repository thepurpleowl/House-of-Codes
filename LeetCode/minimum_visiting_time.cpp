/*On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.

You can move according to the next rules:

In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
You have to visit the points in the same order as they appear in the array.*/

class Solution
{
private:
    int getmax(int a, int b)
    {
        return (a > b) ? a : b;
    }

public:
    int minTimeToVisitAllPoints(vector<vector<int>> &points)
    {
        int counter = 0;
        for (int i = 1; i < points.size(); i++)
        {
            int first = abs(points[i][0] - points[i - 1][0]);
            int second = abs(points[i][1] - points[i - 1][1]);
            counter += getmax(first, second);
        }
        return counter;
    }
};
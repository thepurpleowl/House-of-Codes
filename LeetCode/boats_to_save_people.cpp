/*
The i-th person has weight people[i], and each boat can carry a maximum weight of limit.

Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)

Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)

Solution time complexity: O(nlogn)
Approach:optimization using binary search 
*/
class Solution {
public:
    int check(int m,int lim,vector<int> people)//helper function
    {
        int co=0,i=0,j=people.size()-1;
        while(i<=j)
        {
            if(i==j)
            {
                co++;
                i++;
                j--;
            }
            else if(people[i]+people[j]<=lim)
            {
                co++;
                i++;
                j--;
            }
            else
            {
                co++;
                j--;
            }
            
        }
        if(co<=m)
            return 1;
        else
            return 0;
    }
    int numRescueBoats(vector<int>& people, int limit) {
        int l=1,r=people.size(),mid;
        sort(people.begin(),people.end());
        while(l<r)
        {
            mid=l+(r-l)/2;
            if(check(mid,limit,people))
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
};
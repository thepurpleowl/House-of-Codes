/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(!list1)
            return list2;
        if(!list2)
            return list1;
        ListNode*temp=NULL;
        if(list1->val<list2->val)
        {
          temp=list1;
          list1=list1->next;
        }
        else
        {
         temp=l2;
         list2=list2->next;
        }
        ListNode*new_list=temp;
        while(list1&&list2)
        {
           if(list1->val<list2->val)
           {
               temp->next=list1;
               temp=list1;
               list1=list1->next;
               
           }
            else
            {
                temp->next=list2;
                temp=list2;
                list2=list2->next;
                
            }  
            
        }
      if(list1)
            temp->next=list1;
       if(list2)
            temp->next=list2;
        return new_list;
        
    }
};

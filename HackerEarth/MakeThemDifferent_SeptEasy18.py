name = input().split()           
# N = int(name[0])
X = int(name[1])
Y = int(name[2])
arr = [int(element) for element in input().split()]
valid = [1 for num in arr]
arr_set = set(arr)

cost = 0
arr.sort()
for index, element in enumerate(arr):
    # print (index,' ',element)
    ele_cnt = sum(1 for i,x in enumerate(arr) if((arr[i]==element) and (valid[i]==1)) )
    if(ele_cnt == 1):
        continue
    else:
        temp = element
        n_delete = 0
        while(temp in arr_set):
            n_delete = n_delete + 1
            temp = element - n_delete
        
        if(n_delete*Y < X):
            valid[index] = 0
            arr_set.add(temp)
            cost = cost + n_delete*Y
        else:
            valid[index] = 0
            cost = cost + X
        
        # print(cost,'  ',arr,'   ',arr_set)       
    
print (cost)



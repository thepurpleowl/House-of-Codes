name = input().split()           
# N = int(name[0])
X = int(name[1])
Y = int(name[2])
arr = [int(element) for element in input().split()]
arr.sort()
arr_set = set()
 
cost = 0
for index, element in enumerate(arr):
    if(element in arr_set):
        temp = element
        n_delete = 0
        while(temp in arr_set):
            n_delete = n_delete + 1
            temp = element - n_delete
            
        if(n_delete*Y < X):
            arr_set.add(temp)
            cost = cost + n_delete*Y
        else:
            cost = cost + X
            
        continue
    else:
        arr_set.add(element)
        
        # print(cost,'  ',arr,'   ',arr_set)       
    
print (cost)
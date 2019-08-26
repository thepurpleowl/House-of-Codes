t = int(input())
for i in range(t):
    N = int(input())
    arr = [int(element) for element in input().split()]
    motu_total = 0
    patlu_total = 0
    k = 0
    j = len(arr)-1
    #k for motu
    while(k<j):
        motu_temp = int((motu_total + arr[k])/2)
        patlu_temp = int(patlu_total + arr[j])
        # print (motu_temp,' ',patlu_temp)
        if(motu_temp>patlu_temp):
            # print ("irst")
            motu_total += arr[j]*2
            arr[k] -= arr[j]*2
            patlu_total += arr[j]
            if(j-1 == k):
                break
            else:
                j -= 1
            # print (k,' ',j,' ',motu_total,' ',patlu_total)
            continue
        elif(motu_temp<patlu_temp):
            # print ("seec")
            motu_total += arr[k]
            arr[j] -= int(arr[k]/2)
            patlu_total += int(arr[k]/2)
            if(k+1 == j):
                break
            else:
                k += 1
            # print (k,' ',j,' ',motu_total,' ',patlu_total)
            continue
        else:
            # print ("else")
            motu_total += arr[k]
            patlu_total += arr[j]
            j -= 1
            k += 1
            if(k==j):
                j += 1
                # print (k,' ',j,' ',motu_total,' ',patlu_total)
                break
            elif(k>j):
                j += 1
                k -= 1
                break
            else:
                continue
 
    # print (k,' ',j)    
    motu = k+1
    patlu = len(arr)-motu
    print (str(motu)+' '+str(patlu))
    if(patlu < motu):
        print ("Motu")
    elif(patlu > motu):
        print ("Patlu")
    else:
        print ("Tie")
 
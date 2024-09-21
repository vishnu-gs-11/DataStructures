n = int(input("Enter the size of the List : "))
num = list(map(int,input("Enter the elements to the Array : ").split(" ")))

for i in range(n-1) :
    min_index = i
    for j in range(i+1,n):
        if num[j] < num[min_index] :
            min_index = j 
    temp = num [i]
    num [i] = num [min_index]
    num [min_index] = temp
    
print(num)

"""
input :
5 
2 3 1 5 4

output : 
[1, 2, 3, 4, 5]
"""

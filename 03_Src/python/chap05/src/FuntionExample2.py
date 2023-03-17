

def power(a, b):    
    c = a**b
    return c 
    pass

print(power(2, 3))


def totalSum(limit):
    sum = 0 
    for i in range(1, limit+1):
        sum += i
        
    return sum      # 

value = totalSum(10)
print(value)

for i in range(1, 11):
    print(f'{i} = {totalSum(i)}')
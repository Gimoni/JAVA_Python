
def multifly(a, b=2):   # default argument 디폴트인수
    return a * b 

print(multifly(10, 20), multifly(10), multifly(5))

print("Hello", "World", sep='&', end='\n\n')        # keyword argument 키워드 인수 
print("Hello", "World", '&', end='\n\n')


print("Program End..")
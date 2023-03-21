
def multifly(a, b=2): # default 인수
    return a * b


print(multifly(10, 20), multifly(10), multifly(5))


print("Hello", "World", sep='@', end='\n\n\n')  # keyword 인수
print("Hello", "World", '@', end='\n\n\n')


print("Program End...")
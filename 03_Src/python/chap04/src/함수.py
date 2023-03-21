
def gugudan(dan): # 매개변수 (parameter)
    for i in range(1, 10):
        print(f"{dan} X {i} = {dan*i:2}")
    pass

def power(a, b):
    c = a**b
    return c
    pass


for i in range(2, 10):
    print(f"{i}단")
    gugudan(i) # 아규먼트(argument)
    print()


def gugudan(dan):       # 매개변수 (parameter)
    for i in range(1, 10):
        print(f"{dan} X {i} = {dan*i:2}")
    pass        # 함수를 완정하기 전에 임시로 컴파일 에러를 중지 시키는 용

# def power(a, b):    
#     c = a**b
#     return c 
#     pass

for i in range(2, 10):
    print(f"{i}단")
    gugudan(i)      # argument : 함수를 실행할 때 넘겨주는 값. 
    print()

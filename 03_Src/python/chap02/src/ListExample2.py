# what is range?


print(range(10))                # range list create
print(list(range(10)))          # 0~9까지 출력
print(list(range(1, 10)))       # 1~9까지 출력
print(list(range(1, 10, 2)))       # 1~9까지 2의 배수를 제외하고 출력

for i in range(10):             # for문을 사용한 반복range(10)의 값을 차례대로 출력  
    print(i, ', ', end='')
    
print()

for i in [0, 1, 2, 3, 4]:
    print(i)
    
print()
    
print("Program End...")
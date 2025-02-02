# 리스트 

li1 = [1, 3, 6, 9]      # 리스트

print(li1[0])
print(li1[1])
print(li1[2])
print(li1[3])
# print(li1[4])            Index error

print(li1[-1])
print(li1[-2])
print(li1[-3])
print(li1[-4])
print(li1[1:3])             # indexing slicing 

li2 = [
    [ 1, 2, 3, 4, 5],
    [11, 12, 13, 14, 15],
    [21, 22, 23, 24, 25],
]

print(li2)
print("li2 length =", len(li2))         # li2 list length 구하기
print("li2[0] length =", len(li2[0]))         # li2[0] list length 구하기
print("li2[1] length =", len(li2[1]))         # li2[1] list length 구하기
print("li2[2] length =", len(li2[2]))         # li2[2] list length 구하기


count = 0 
for i in range(len(li2)):
    for j in range(len(li2[i])):
        # print(li2[i][j], ", ", sep='', end='' )
        # print("%2d," % li2[i][j], end='')
        print(f"{li2[i][j]:2}," , end='')
        count += 1
    print()
    

print("count = " , count)

print("="*100)

for raw in li2:
    for col in raw:
        print(col, ",", end='')
        
    print()
    
print("Program End...")
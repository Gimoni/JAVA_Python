
import random as r 
import time as t

line = r.randint(1, 20)
column = r.randint(1, 40)
fg = r.randint(30, 37)
bg = r.randint(40, 47)
ch = chr(r.randint(ord('A'), ord('Z')))

print(type(ch))
print(type(bg))
print(type(fg))
# print()

rect = [];
for i in range(20):
    rect.append([False]*40)
    for j in range(20):
        rect.append([fg]*40)
        for y in range(20):
            rect.append([bg]*40)
    
# saveRect = [];
# for i in range(3):
#     saveRect.append([fg]*20)
#     for j in range(20):
#         saveRect.append([]*40)
    
print("rect len=", len(rect))
# print("savrRect len=", len(saveRect))
print("rect[0] len=", len(rect[0]))
print("rect[1] len=", len(rect[1]))
print("rect[2] len=", len(rect[2]))
# print("saveRect[0] len=", len(saveRect[0]))

rect[ch][fg][bg]= 0

for i in range(len(rect)):
    
    
    for j in range(len(rect[i])):
        print("%d," % rect[i][j][y], end='')
    print()

#
# for i in range(len(rect)):
# # while True:                             # 무한루프 
#
#
#     print([[ch]*column]*line)
#     print("\033[%d;%dH" % (line, column), end='')
#     print("\033[%dm" % fg, end='')
#     print("\033[%dm" % bg, end= '')
#     print("%c" % ch, end= '', flush=True)
#
#
#     # t.sleep(0.1)        # 100millisec
#     t.sleep(0.01)
#
#
#
# print("\033[0m", end='')
print("\033[21;1H", end='')

print("Program End...")







import random as r 
import time as t

print("\033[2J", end='')

rect = []

for i in range(20):
    rect.append([False]*40)

loopCount = 0
count = 0

# for i in range(1000):
while True:                             # 무한루프 
    
    loopCount += 1
    print("\033[1;50H", end='')
    print("\033[0m", end='')
    print('loopCount = %4d' % loopCount, end='', flush=True)

    
    line = r.randint(1, 20)
    column = r.randint(1, 40)
    fg = r.randint(30, 37)
    bg = r.randint(40, 47)
    ch = chr(r.randint(ord('A'), ord('Z')))
    
    
    print("\033[%d;%dH" % (line, column), end='')
    print("\033[%dm" % fg, end='')
    print("\033[%dm" % bg, end= '')
    print("%c" % ch, end= '', flush=True)
    
    if rect[line-1][column-1] == False:
        count += 1
        print("\033[2;50H", end='')
        print("\033[0m", end='')
        print('count = %4d' % count, end='', flush=True)
        
        
    rect[line-1][column-1] = True
        
    if count == 800:
        break
    
    # t.sleep(0.1)        # 100millisec
    t.sleep(0.001)

    
print("\033[0m", end='')
print("\033[21;1H", end='')

print("Program End...")







import random as r 
import time as t

print("\033[2J", end='')


# for i in range(1000):
while True:                             # 무한루프 
    
    line = r.randint(1, 20)
    column = r.randint(1, 40)
    fg = r.randint(30, 37)
    bg = r.randint(40, 47)
    ch = chr(r.randint(ord('A'), ord('Z')))
        
    
    print("\033[%d;%dH" % (line, column), end='')
    print("\033[%dm" % fg, end='')
    print("\033[%dm" % bg, end= '')
    print("%c" % ch, end= '', flush=True)
    
    
    # t.sleep(0.1)        # 100millisec
    t.sleep(0.01)

    
print("\033[0m", end='')
print("\033[21;1H", end='')

print("Program End...")






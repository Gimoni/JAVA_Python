from util.VT100 import clearScreen, cursorMove, reset, setForeground,\
    setBackground
import random as r 
import time as t

clearScreen()

rect = []

for i in range(20):
    rect.append([False]*40)
    
loopCount = 0
count = 0

while True:
    cursorMove(1, 50)
    reset()
    
    line = r.randint(1, 20)
    column = r.randint(1, 40)
    fg = r.randint(30, 37)
    bg = r.randint(40, 47)
    ch = chr(r.randint(ord('A'), ord('Z')))
    
    
    if rect[line-1][column-1]==False:
        count += 1
        cursorMove(2, 50)
        print('count = %4d' % count, end='', flush=True)
        
    rect[line-1][column-1] == True
               

    if count == 800:
        break

    t.sleep(0.001)
             
    pass


reset()
cursorMove(21, 1)

print("Program End")







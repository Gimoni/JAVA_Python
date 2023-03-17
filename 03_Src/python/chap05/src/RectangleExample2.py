from util.VT100 import clearScreen, cursorMove, reset, setForeground,\
    setBackground
from random import randint
from time import sleep

clearScreen()

rect = []

for i in range(20):
    rect.append([False]*40)
    
loopCount = 0
count = 0

while True:
    line = randint(1, 20)
    column = randint(1,40)
    fg = randint(30,37)
    bg = randint(40,47)
    ch = chr(randint(ord('A'), ord('Z')))
    
    cursorMove(line, column)
    setForeground(fg)
    setBackground(bg)
    print(ch, end='', flush=True)
         
          
    sleep(0.01)  
    
    pass


reset()
cursorMove(21, 1)

print("Program End")







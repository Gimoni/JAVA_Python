from util.VT100 import clearScreen, reset, cursorMove, setForeground,\
    setBackground
from random import randint
from time import sleep


clearScreen()

while True:
    line = randint(1, 20)
    column = randint(1, 40)
    fg = randint(30, 37)
    bg = randint(40, 47)
    ch = chr(randint(ord('A'), ord('Z')))
    
    cursorMove(line, column)
    setForeground(fg)
    setBackground(bg)
    print(ch, end='', flush=True)
    
    sleep(0.1)
    
    pass


reset()

print("Program End")
from util.VT100 import cursorMove, reset, clearScreen, setForeground,\
    setBackground

from util.Font import printFont
from time import sleep
from random import randint



clearScreen()

for i in range(50):
    ch = chr(randint(ord('0'), ord('9')))
    
    printFont(ch, 10, 1+i)
    
    sleep(0.5)
    
    printFont(' ', 10, 1+i)

reset()


print("Program End")
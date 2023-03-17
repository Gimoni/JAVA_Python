from util.VT100 import cursorMove, reset, clearScreen, setForeground,\
    setBackground

from util.Font import printFont
from time import sleep
from random import randint



clearScreen()

for i in range(50):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 10, 1+i)
    sleep(0.1)
    printFont(' ', 10, 1+i)
    
for i in range(30):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 10+i, 50)
    sleep(0.1)
    printFont(' ', 10+i, 50)
    
for i in range(30):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 35, 50-i)
    sleep(0.1)
    printFont(' ', 35, 50-i)
    
for i in range(30):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 35-i, 1)
    sleep(0.1)
    printFont(' ', 35-i, 1)
    
reset()


print("Program End")
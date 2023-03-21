from util.VT100 import cursorMove, clearScreen, reset, setForeground, setBackground

from util.Font import printFont

clearScreen()

for i in range(10):
    printFont(str(i), 10, 1 + i*6)
    
reset()    
    

print("Program End...")
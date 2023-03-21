
from util.VT100 import *

clearScreen()

cursorMove(column=20, line=10)
setForeground(31)   # red
setBackground(44)   # blue
print("Hello World", end='', sep='', flush=True)

reset()

print("Program End")
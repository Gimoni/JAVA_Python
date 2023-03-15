
import random as r 
import time as t


line = r.randint(1, 20)
column = r.randint(1, 40)
fg = r.randint(30, 37)
bg = r.randint(40, 47)
ch = r.randint(65, 90)
    
    
print(line, column, fg, bg, sep=",")            # basic string
print("[%02d, %02d, %02d, %02d"  % (line, column, fg, bg))  # % format 
print(f"[{line}, {column}, {fg},{bg}]")         #f-string 


print("Program End...")






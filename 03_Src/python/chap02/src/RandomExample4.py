
import random as r 
import time as t


line = r.randint(1, 20)
column = r.randint(1, 40)
fg = r.randint(30, 37)
bg = r.randint(40, 47)
ch = chr(r.randint(ord('A'), ord('Z')))
    
    
print(line, column, fg, bg, sep=",")            # basic string
print("[%02d, %02d, %02d, %02d, %c]"  % (line, column, fg, bg, ch))  # % format 
print(f"[{line}, {column}, {fg}, {bg}, {ch}]")          #f-string 


print(ord('A'), ord('Z'))


print("Program End...")






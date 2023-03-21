from util.VT100 import clearScreen, reset
from util.Font import printFont

clearScreen()

year = 2023
month = 3
day = 20

date = f'{year:04d}-{month:02d}-{day:02d}'

for i in range(len(date)):
    ch = date[i]
    printFont(ch, 10, 10 + i*7)


reset()    

print("Program End...")
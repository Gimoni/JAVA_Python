# test example
from util.VT100 import clearScreen, reset
from util.Font import printFont
from time import time
from datetime import datetime, date
from util.getDateTime import printDate, printTime

current =  time()
clearScreen()


printDate = f'{year:04d}-{month:02d}-{day:02d}'
for i in range(len(printDate)):
    ch = printDate[i]        # 저장 
    # print(date[i])
    # print(ch)
    printFont(ch, 10, 10 + i*7)
    
printTime = f'{hour:02d}:{minute:02d}:{second:02d}'
for i in range(len(printTime)):
        ch = printTime[i]
        printFont(ch, 20, 25 + i*7)

# getWeekDay = f'{week:03s}'


print()
print(printDate)
print(printTime)




reset()

print("Program End")
# test example
from util.VT100 import clearScreen, reset
from util.Font import printFont

import time


current = time.time(); 
clearScreen()

def getDate(year, month, day):
    # current = time.time();
    # while(True):
    #     year = 1970
    #     week = 4
    #     dayOfYear = 365
    #     if(year%4==0 and year%100!=0 or year%400==0):
    #         dayOfYear+=1
    #
    #     secondOfYear = dayOfYear*24*60*60
    #
    #     if (int(current)-secondOfYear >=0):
    #         current -= secondOfYear
    #         week += dayOfYear
    #     else: 
    #         dayOfYear
    #
    #     year +=1
    #     return year 
    #
    # month = 0
    # for i in range(1,13):
    #     dayOfMonth =[31,28,31,30,31,30,31,31,30,31,30,31]
    #     if(year%4==0 and year%100!=0 or year%400==0):
    #         dayOfYear[1] = 29
    #
    # secondOfMonth = int(dayOfMonth)*24*60*60
    # if (int(current)-int(secondOfMonth) >= 0):
    #     current -= int(secondOfMonth)
    #     week += dayOfMonth
    # else : 
    #     month = i
    # break
    # return month
    year = int(current)//60
    month = int(current)//60//60
    day = int(current)//60//60%24
    # return day
    return "%04d-%02d-%02d" % (year, month, day)

def getTime(hour, minute, second):
    hour = int(current)//60//60%24 + 9
    minute = int(current)//60%60
    second = int(current)%60
    return "%02d:%02d:%02d" % (hour, minute, second)

# date = '2023-03-20'
getDate= f'{year:04d}-{month:02d}-{day:02d}'
for i in range(len(getDate)):
    ch = getDate[i]        # 저장 
    # print(date[i])
    # print(ch)
    printFont(ch, 10, 10 + i*7)
    
getTime = f'{hour:02d}:{minute:02d}:{second:02d}'
for i in range(len(getTime)):
        ch = getTime[i]
        printFont(ch, 20, 20 + i*7)

# print()
print(getDate)
print(getTime)




# reset()

print("Program End")

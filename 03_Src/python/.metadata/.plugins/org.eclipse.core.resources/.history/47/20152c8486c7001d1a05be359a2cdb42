import time
from datetime import datetime, date

def printDate(year, month, day):
    current = time.time();
    
    while(True):
        year = 1970
        week = 4
        dayOfYear = 365
        if(year%4==0 and year%100!=0 or year%400==0):
            dayOfYear+=1
            
        secondOfYear = dayOfYear*24*60*60
        
        if (int(current)-secondOfYear >=0):
            current -= secondOfYear
            week += dayOfYear
        else: 
            dayOfYear
        
        year +=1
    return year 

    month = 0
    for i in range(1,13):
        dayOfMonth =[31,28,31,30,31,30,31,31,30,31,30,31]
        if(year%4==0 and year%100!=0 or year%400==0):
            dayOfYear[1] = 29
    
    secondOfMonth = int(dayOfMonth)*24*60*60
    if (int(current)-int(secondOfMonth) >= 0):
        current -= int(secondOfMonth)
        week += dayOfMonth
    else : 
        month = i
    # break
    return month
    
    day = int(current)/60/60/24
    return day
    # return week



#### 해결하기.. 
def getWeekDay(week):
    week = 4;
    current = time.time();
    week += printDate.day
    
    while(True):        
        weekName = ['MON','TUE','WED','THU','FRY','SAT','SUN']
        week=(4+int(current)/60/60/24)%7
        if(int(current) - printDate.day*24*60*60 >0 ):
            week = week%7 
            print(week)
    return week



# print(f'{getWeek()}')

    # day = pass
    
def printTime(hour, minute, second):    
    current = time.time()
    hour = int(current)//60//60%24 + 9
    minute = int(current)//60%60
    second = int(current)%60
    
    return hour
    return minute
    return second


# print(printDate(year, month, day))


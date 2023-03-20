# 달력

year = int(input("year>>>" ))

month = int(input("month>>>" ))

print(type(year))
print(type(month))

print("%4d년 %2d월" % (year, month))

totalDay =0

# totalDay = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400
isLeap = "윤년" if (year%4==0 and year%100!=0 or year%400==0 ) else "평년"

print(year, isLeap) 

dayOfMonth = [31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30, 31]

if(year%4==0 and year%100!=0 or year%400==0):
    dayOfMonth[2]= '29'
    
for i in range(0,11):
    totalDay = isLeap + (dayOfMonth[i-1])
    
week = (1 + totalDay)% 7

print("         %4d년 %2d월" % (year, month))
print(" SUN MON TUE WED THU FRI SAT")

for i in range(week):
    print("%4s" % "#")
    
for i in range(dayOfMonth-1):
    week+1
    print("%4d" % i)
    if (week%7==0):
        print()

 


print ("Program End...")

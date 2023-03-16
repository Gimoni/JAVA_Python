
import random as r 


year = 2023

isLeap = "윤년" if (year%4==0 and year%100!=0 or year%400==0 ) else "평년"

print(year, isLeap) 

num = r.randint(0, 100)

oddEven = "짝수" if num%2==0 else "홀수"

print(num, oddEven)





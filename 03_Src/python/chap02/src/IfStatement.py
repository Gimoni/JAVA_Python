
import random as r

jumsu = int(r.random()*101)
grade = 'F'


if jumsu>=90:
    grade = 'A'
elif jumsu>=80:
    grade = 'B'
elif jumsu>=70:
    grade = 'C'
elif jumsu>=60:
    grade = 'D'
elif jumsu>=50:
    grade = 'E'
elif jumsu>=40:
    grade = 'F'
    
print(jumsu)




print (jumsu, " => ", grade)

print ("Program End....")


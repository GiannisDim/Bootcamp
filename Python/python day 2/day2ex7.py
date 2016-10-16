
x = input("Enter dates:")

y = x.split(' ')
d1 = y[0].split('/')
d2 = y[1].split('/')


y1 = int(d1[2])
m1 = int(d1[1])
day1 = int(d1[0])

y2 = int(d2[2])
m2 = int(d2[1])
day2 = int(d2[0])

c1 = 365*y1 + y1//4 - y1//100 + y1//400 + (306*m1 + 5)//10 + (day1 - 1)
c2 = 365*y2 + y2//4 - y2//100 + y2//400 + (306*m2 + 5)//10 + (day2 - 1)


if c1 > c2:
    days = c1 - c2
else:
    days = c2 - c1



print(days, "days.")


    
     

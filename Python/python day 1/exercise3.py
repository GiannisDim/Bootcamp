import math
a = int(input("Add the value for side one:"))
b = int(input("Add the value for side two:"))
c = int(input("Add the value for side one:"))
r = 0
r = (a + b + c)*(b + c - a)*(a - b + c)*(a + b - c)
x = 1/4 * math.sqrt(r)
print(x)

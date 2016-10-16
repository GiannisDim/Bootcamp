import math
a = int(input("Give a number : "))
b = int(input("Give a number : "))
c = int(input("Give a number : "))
y = b**2 - 4*a*c
if y < 0:
    print("Sorry, no real-valued solutions exist")
else:
    r = b**2 - 4 *a * c
    x = ((-b)+ math.sqrt(r))/(2 * a)
    print(a*x**2 + b*x + c)
    z = ((-b)- math.sqrt(r))/(2 * a)
    print(a*z**2 + b*z + c)
    

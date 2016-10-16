i = 50
sum = 0

while i >= 1:
    x = str(i)
    y = input("Enter number of "+x+" euro banknotes :")
    z = i*int(y)
    if i > 20:
        i = i - 30
    else:
        i = i // 2
    sum = sum + z

print("You have", sum, "euros")

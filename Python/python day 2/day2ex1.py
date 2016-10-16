
x = input("Enter Tax Identification Number :")
y = len(x)
digits = []

for i in range(0,y):
    if i == y-1:
        check = int(x[i])
    else:
        digits.append(int(x[i]))

digits.reverse()
sum = 0
for i in range(0,7):
    
    digits[i] = digits[i]*(2**(i+1))
    sum = sum + digits[i]
    


rem = (sum % 11) % 10

if rem == check:
    print("Tax Identification Number valid.")
else:
    print("Tax Identification Number not Valid")

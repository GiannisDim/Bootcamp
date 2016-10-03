x = input("Enter 9 digit nuber:")

digit = []
[digit.append(int(x[i])) for i in range(9)]

for i in range(3):
    if i == 0:
        print(repr(digit[i]).ljust(2),repr(digit[i+3]).ljust(2),repr(digit[i+6]).ljust(2),"\n")
    elif i == 1:
        print(repr(digit[i]).rjust(2),repr(digit[i+3]).rjust(2),repr(digit[i+6]).rjust(2),"\n")
    else:
        print(repr(digit[i]).rjust(3),repr(digit[i+3]).rjust(2),repr(digit[i+6]).rjust(2),"\n")
              

        
    

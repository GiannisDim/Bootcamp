x = input("Enter 10 digit number:")
digit = []
[digit.append(int(x[i]))for i in range(10)]
even = []
odd = []
for i in range(10):
    if digit[i] % 2 == 0:
        even.append(digit[i])
    else:
        odd.append(digit[i])
  
for i in range(len(odd)):
    print(repr(odd[i]).ljust(1),end=' ')
print("\n")
for i in range(len(even)):
    print(repr(even[i]).rjust(2),end='')

    
        

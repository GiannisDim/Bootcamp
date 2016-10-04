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
    print(odd[i],end=' ')
print("\n", end=' ')
for i in range(len(even)):
    print(even[i],end=' ')

    
        

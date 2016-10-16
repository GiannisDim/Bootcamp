x = input("Enter binary number:")
y = len(x)
bits = []
sum = 0
for i in range(0,y):
    bits.append(int(x[i]))
    if bits[i] == 1:
        sum = sum + 1

if sum % 2 == 0:
    print("Parity check OK.")
else:
    print("Parity check not OK.")

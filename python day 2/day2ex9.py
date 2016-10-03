x = int(input("Enter shift: "))
y = input("Enter phrase: ")
phrase = []
[phrase.append(y[i]) for i in range(len(y))]
for i in range(len(y)):
    z = ord(phrase[i])
    if z + x <= 90:
        phrase[i] = chr(z + x)
    else:
        sum = x + z
        while sum > 90:
            sum = sum -26
        phrase[i] = chr(sum)
    print(phrase[i],end='')

print('\n')
ans = input("Do you want to do decryption again ? ")
if ans == 'y':
    for i in range(len(y)):
        z = ord(phrase[i])
        if z - x >= 65:
            phrase[i] = chr(z - x)
        else:
            sum = z - x
            while sum < 65:
                sum = sum + 26
            phrase[i] = chr(sum)
        print(phrase[i],end='')

    



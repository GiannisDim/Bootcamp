x = int(input("Enter limit: "))
pol = 0
polite = []
for i in range(0,(x+1)):
    y = i
    mod = 0
    while mod == 0 and y > 2:
        mod = y % 2
        y = y / 2
        if  mod != 0:
            pol = 0
    if mod != 0:
        polite.append(int(i))
sum = 0        
for i in range(len(polite)):
    print(polite[i], end=' ')
    sum = sum + 1
    if sum == 10:
        print('')
        sum = 0
    

x = input("Enter number sequence:")
y = len(x)
num = []
for i in range(y):
    num.append(int(x[i]))
sum = 0
if y % 2 == 0:
    for i in range (0, y, 2):
            sum = sum + (num[i]*num[i+1])
else:
    for i in range(0, y-1, 2):
            sum = sum + (num[i]*num[i+1])
    sum = sum + num[y-1]

print(sum)
        


    

def lis():
    x = []
    for i in range(3):
       x.append(input("Enter a number with "+str(i+1)+" digits: "))
    return x;

y = lis()
z = lis()
t = lis()
for i in range(3):
    print(repr(int(y[i])).rjust(3)+"|"+repr(int(z[i])).rjust(3)+"|"+repr(int(t[i])).rjust(3))

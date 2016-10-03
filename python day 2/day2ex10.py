x = input("Enter binary sequence: ")
binar = []
[binar.append(int(x[i])) for i in range(len(x))]
maximum = 1
length1 = 1
length0 = 1
z = len(x) - 1

for i in range(z):
    if binar[i] == binar[i+1]:
        if binar[i] == 0:
            length0 = length0 + 1
            if length0 >= maximum:
                if length0 == maximum:
                    maxbinar = "Equal"
                else:
                    maximum = length0
                    maxbinar = "zeros"
                
                
                
        else:
            length1 = length1 + 1
            if length1 >= maximum:
                if length1 == maximum:
                    maxbinar = "Equal"
                else:
                    maximum = length1
                    maxbinar = "ones"
                
                
    else:
        length0 = 1
        length1 = 1

        
if (maxbinar == "Equal"):
    print(maxbinar, "longest run of ones and zeros with length: ", maximum)  
else:
    print("Longest run was", maxbinar, "with length :", maximum)

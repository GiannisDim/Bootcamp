def easter(y):
    a = y % 4
    b = y % 7
    c = y % 19
    d = (19*c + 15) % 30
    e = (2*a + 4*b - d + 34) % 7
    month = (d + e + 114) // 31
    day = (((d + e + 114) % 31) + 1) + 13
    if day >= 31:
        day = day - 31
        month = month + 1
        if (month == 3) or (month == 5):
            day = day + 1         
    print("Day: ", day, " ", "Month: ", month)
    

y = int(input("Enter year:"))
easter(y)


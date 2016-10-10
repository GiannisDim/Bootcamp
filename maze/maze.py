# read the file and creat a "table" (every line of the txt is one element of table list)
with open('maze1.txt','r') as f:
    data = f.readlines()
    table = []
    for line in data:
        table.append(line.split())

#loop running the "table" to find start and end point
maxi = 0
for i in range(len(table)):
    maxi = maxi + 1
    for j in range(len(table[i])):
        #find start point
        if (table[i][j] == 'S'):
            start = (i,j)
        #find end point
        if (table[i][j] == 'G'):
            end = (i,j)
# add in variables the number of rows and columns
maxj = len(table[0]) - 1
maxi = maxi - 1

#set starting points
x = start[0]
y = start[1]
#create the path list safe the path to the exit including the steps moving forward and back again in the same path
path = []
path.append(start)
#create the meme list to store the spots of decision
meme = []
# store the decision ex. move left , move right etc
memestep = []
#stores the used memespots
checklist = []
#stores the steps we did after a used memespot
stepstocheckpoint = []
'''
everytime checking clockwise the next step, storing the spot
if there is more than one possible moves.If the first decision
leads to a dead end we pop the last meme spot and it takes the
next available decision.when x is equal to end(x) and y equal to end(y)
we stop the loop, we clear the path from double steps and we print the clear path
'''
stop = 0
while stop == 0:

    moves = 0

    if y + 1 <= maxj:
        if table[x][y+1] != 'X':
            if not (x,y+1) in path:
                step = 'r'
                r = y + 1
                moves = moves + 1
    if x + 1 <= maxi:
        if table[x+1][y] != 'X':
               if not (x+1,y) in path:
                    b = x + 1
                    moves = moves + 1
                    if moves <= 1:
                        step = 'b'
    if y - 1 >= 0:
        if table[x][y-1] != 'X':
            if not (x,y-1) in path:
                    l = y - 1
                    moves = moves + 1
                    if moves <= 1:
                        step = 'l'
    if x - 1 >= 0:
        if table[x-1][y] != 'X':
            if not (x-1,y) in path:
                    t = x - 1
                    moves = moves + 1
                    if moves <= 1:
                        step = 't'
    if moves > 1:
        memespot = (x,y)
        meme.append(memespot)


    if step == 'r':
        y = r
    elif step == 'b':
        x = b
    elif step == 'l':
        y = l
    else:
        x = t
    spot = (x,y)
    path.append(spot)
    memestep.append(step)
    if moves == 0:
        checkpoint = meme.pop()
        checklist.append(checkpoint)
        x = checkpoint[0]
        y = checkpoint[1]
        count = 0
        mode = 'off'
        for i in range(len(path)):
            if checkpoint == path[i] :
                mode = 'on'
            if mode == 'on':
                count = count + 1
        mode = 'off'
        stepstocheckpoint.append(count)


    if x == end[0] and y == end[1]:
        stop = 1


m = 0
#store the direct path to the exit
finalpath = []
j = 0
i = 0
x = (len(path))
#clear the path (add to list final path only the needed steps so we can have the clear path)
while i < x:
    if j < len(checklist):
        if path[i] == checklist[j]:
            j = j + 1
            finalpath.append(path[i])
            i = i + stepstocheckpoint[m]
            m = m + 1
        else:
            finalpath.append(path[i])
            i = i + 1
    else:
        finalpath.append(path[i])
        i = i + 1


print(finalpath)

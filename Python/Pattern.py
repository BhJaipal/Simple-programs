#Program 1
a =2
for b in range (1,6,2):
    print ("  "*a,"*"*b)
    a-=1
a=1
for c in range (3,0,-2):
    print ("  "*a,"*"*c)
    a+=1
print ("Difficulty: Simple")

print ()

#Program 2.1
j=5
z=4
for i in range (1,j+1):
    print("   "*z,end=" ")
    for k in range (1,i+1):
        print (k,end =" ")
    z-=1
    print ()
print ("Difficulty: Simple")

print ()

#Program 2.2
j=5
z=0
for l in range (j,0,-1):
    print ("   "*z, end ="")
    for m in range (l,0,-1):
        print (m,end=' ')
    z+=1
    print ()
print("Difficulty: Simple")

print ()

#Program 3
print ("  "*4,"*"*1)
J=0
for I in range (4,1,-2):
    print("  "*J," * "*I,)
    J+=2
print ("  "*3," *"*1)
print ("  "*2," * "*2)
print ("Difficulty: Normal")

print ()

#Program 4
A=10
for B in range (1,4):
    print ("  "*A,"* "*B)
    A-=1
print(" "*3,"* "*11)
N=4
C=4
for I in range (1,3):
    if C==4:
        C=8
        print ("  "*N,end =" ")
        print("* "*C)
print ("  "*6,"* "*5)
print ("  "*7,"* "*4)
print ("  "*6,"* "*5)
print ("  "*4,end="  ")
print("* "*3,end="  ")
print ("* "*3)
print ("  "*4,end ="")
print ("* "*2,end="   "*4)
print ("* "*2)
print ("      " "* ","  "*7,"      *")
print ("Difficulty: Hard")

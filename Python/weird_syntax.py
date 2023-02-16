
# this file contains python codes
# with weird Syntax like 

# input in function arguments 
def cbrt(num):
    return num** (1/3)

cbrt(int(input("Enter a perfect cube: ")))

# use of semi colon and multiple lines
print("Hello, Please enter your name");name= input("Name here:");
print(f"Hello your name is {name}");

# break with if statement and semi colon

def breaker():
    while True:
        speed= input("Enter speed: ")
        if speed>160: break;
        else: print("Continue");

breaker()
# I have find this from another repo
import sys
def printc(color,message):
    print(color+message+"\033[0m")

name ="Jaipal"
printc("\033[34m","Programming")        # blue text
printc("\033[31m","Python3")        # red text
printc("\033[0m", "My name is{}".format(name))        # present theme text color
printc("\033[32m",sys.argv[0])        # green text
printc("\033[35m",sys.argv[0])        # pink text
printc("\033[33m",sys.argv[0])        # yellow text
printc("\033[36m", "Hello , my name is {}".format(name))        # cyan text

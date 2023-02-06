import os
import setuptools
def terminal():
    print()
    select = input("Enter os/setup:  ")
    print("Python terminal is starting")
    if select.lower() == "os":
        return os.system("sh")
    else:
        return setuptools.setup()
terminal()
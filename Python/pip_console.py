import os,os.path,sys,pip

def modcmd(arg):
  os.system(arg)

if not(os.path.exists(sys.prefix+"/bin/pip")):
  print("You need to install pip first.")
print("Input pip commands, ie: pip install {module}")
while(True):
  cmd=input("-->")
  if (cmd==""): break;
  modcmd(cmd)

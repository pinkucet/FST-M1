a=15
b=0
try:
    #print(x) 
    c=a/b  
except NameError:
    print("variable a is not defined")
except ArithmeticError:
    print("number divide by o exception")
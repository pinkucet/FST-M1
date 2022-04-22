def sumFunction(n):
    if(n==0):
        return n
    else:
        return n+sumFunction(n-1)

print("Sum of numbers is ",sumFunction(10))

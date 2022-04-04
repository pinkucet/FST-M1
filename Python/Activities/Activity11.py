#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

myDict = {
            "Apple":10,
            "Orange":15,
            "Mango": 34,
            "Banana":35,
            "Plum":100}

print(myDict)
userInput = input("Enter the fruit name to search")


if(userInput in myDict):
    print(userInput," is available and price is: ",myDict[userInput])
else:
    print("Invalid Input")
        
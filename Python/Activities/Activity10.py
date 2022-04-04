#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
#creating EmptyTuple

myList=list(())

#Inserting valus using user input
for x in range(5):
    values = int(input("Enter "+str(x)+" indices value"))
    myList.insert(x,values)

myTuple = tuple(myList)
print("Printing all values inside my tuple")
print(myTuple)
print("Printing values divisible by 5")
for x in myTuple:
    if(x%5==0):
        print(x)
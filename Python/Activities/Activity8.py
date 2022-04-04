# Given a list of numbers, return True if first and last number of a list is same
#creating EmptyList

myList=list(())

#Inserting valus using user input
for x in range(5):
    values = int(input("Enter "+str(x)+" indices value"))
    myList.insert(x,values)

print(myList)

if(myList[0]==myList[-1]):
    print("True")
else:
    print("False")
# Calculate sum of all elements in a list
#creating EmptyList
myList=list(())

#INserting valus using user input
for x in range(5):
    values = int(input("Enter "+str(x)+" indices value"))
    myList.insert(x,values)

print(myList)
sum=0
#Calculating sum of all elements in a list
for y in myList:
    sum=sum+y

print("sum of all elements in list is",sum)


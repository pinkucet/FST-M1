# Given a two list of numbers create a new list such that new list should contain only odd 
# numbers from the first list and even numbers from the second list
#creating EmptyList

myList=list(())
listA = [12,13,8,7,5]
listB = [3,5,8,19,22]

for x in listA:
    if(x%2!=0):
        myList.append(x)

for x in listB:
    if(x%2==0):
        myList.append(x)

print(myList)
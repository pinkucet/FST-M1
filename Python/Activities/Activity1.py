#Activity1 Program
import datetime

userInput_Name = input("Enter Your Name")
userInput_Age = input("Enter Your age")
ageCalc = 100-int(userInput_Age)
x = datetime.datetime.now()
y=x.year+ageCalc
txt = "Hi {} You will become 100 year old on year {}"
print(txt.format(userInput_Name,y))
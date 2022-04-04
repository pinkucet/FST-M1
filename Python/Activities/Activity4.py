	
# Ativity 2 Rock, Paper, scessiors game with enhancement

# Get the users choices
user1Input = input("What do you want to choose rock, paper or scissors? ").lower()
user2Input = input("What do you want to choose rock, paper or scissors? ").lower()
 
# Run the algorithm to see who wins
if user1Input == user2Input:
    print("No Result")
elif user1Input == 'rock':
    if user2Input == 'scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif user1Input == 'scissors':
    if user2Input == 'paper':
        print("Scissors win")
    else:
        print("Rock wins")
elif user1Input == 'paper':
    if user2Input == 'rock':
        print("Paper wins")
    else:
        print("Scissors win")
else:
    print("Invalid input, try again.")
 

# Ask for Repeat
repeat = input("Do you want to play again? Yes/No: ").lower()
    
if(repeat == "yes"):
        pass
elif(repeat == "no"):
        raise SystemExit
else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
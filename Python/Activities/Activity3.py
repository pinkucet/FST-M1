	
# Ativity 2 Rock, Paper, scessiors game

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

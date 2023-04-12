# Homework:


### While Loop

Write a program that prompts the user to guess a secret number between 1 and 100. The program should generate a random secret number and then ask the user to guess it. If the user's guess is too high, the program should print "Too high!" and ask the user to guess again. If the user's guess is too low, the program should print "Too low!" and ask the user to guess again. If the user's guess is correct, the program should print "Congratulations!" and exit the loop.

Here's how the program should work: 
1. Generate a random secret number between 1 and 100 using the **`Math.random()`** method.
2. Prompt the user to enter a guess.
3. Read the user's guess using a Scanner object.
4. Use a while loop to check if the user's guess is correct, too high, or too low.
5. If the user's guess is too high, print "Too high!" and ask the user to guess again.
6. If the user's guess is too low, print "Too low!" and ask the user to guess again.
7. If the user's guess is correct, print "Congratulations!" and exit the loop.

***Example:***
```bash
The secret No. is -->> 77
Guess the number: 70
Too low! Enter a new number: 75
You are very close! Enter a new number: 95
Too high! Enter a new number: 79
You are very close! Enter a new number: 77
Congratulations!

Process finished with exit code 0
```

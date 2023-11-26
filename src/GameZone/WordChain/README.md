<h1 style="text-align: center">Word Chains Game</h1>


**Description:** The Word Chain game is a console-based game where players need to enter words that start with the last letter of the previously entered word.

**Features:**
- Random selection of categories: Animal, City, Name, AnyWord
- Input validation for alphabetic characters
- Tracks used words within the session
- Calculates scores for successful word choices
- Allows players to exit or quit the game anytime

**Instructions:**
1. **Running the Game:**
    - Compile the Java files (`WordChainGame.java` and `Main.java`).
    - Run the `Main` class to start the game.

2. **Gameplay:**
    - The game will randomly select a category (Animal, City, Name, AnyWord).
    - Enter a word related to the selected category as the starting word.
    - Subsequently, enter words that start with the last letter of the previously entered word.
    - For each successful word choice, the player's score will increase.
    - Input "exit" or "quit" at any time to end the game.

3. **Scoring:**
    - The player earns a point for each successful word choice that follows the previous word's pattern.
    - The score is displayed during the game to track the player's progress.

**Sample Gameplay:**
- Category: Animal
- Starting Word: "elephant"
- Player 1: Enters "tiger" - Score: 1
- Player 2: Enters "rabbit" - Score: 2
- Player 1: Enters "turtle" - Score: 3
- ...
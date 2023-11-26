<h1 style="text-align: center">Rock-Paper-Scissors Game</h1>


**Description:** Rock-Paper-Scissors is a simple console-based game where a human player competes against a computer by choosing between rock, paper, or scissors.

**Features:**
- Human player inputs choice: 'R' for Rock, 'P' for Paper, 'S' for Scissors
- Computer generates a random choice
- Compares choices to determine the winner of each round
- Tracks and displays the scores for both the human player and computer
- Provides a procedural version of the game in a single class
- Separates game logic for playing or exiting into the Main class

**Instructions:**
1. **Running the Game:**
   - Compile the `Game.java`, `Player.java`, `ProceduralVersion.java`, and `Main.java` files.
   - Run the `Main` class to start the game (or run `ProceduralVersion` class).
2. **Game Logic Separation:**
   - The game exists in two versions:
     - `ProceduralVersion.java`: Offers a self-contained procedural version with all logic encapsulated within a single class.
     - `Main.java`: Implements a version where game flow control is distributed across different classes. This separation of logic among classes enhances maintainability and readability of the codebase.
    

3. **Gameplay:**
   - The game prompts the human player to enter their move (R/P/S).
   - The computer randomly selects its move (Rock, Paper, or Scissors).
   - The winner of each round is determined based on the choices.
   - Scores for both the human player and computer are updated accordingly and displayed.

**Sample Gameplay (Main Class):**
- Human player selects Rock.
- Computer selects Scissors.
- round = Win. Your score is 1.
- Prompts "Continue: Yes/No" after each move.
- ...


**Procedural Version Gameplay:**
- All game logic contained within the `ProceduralVersion` class.
- Implements the game's logic without class separation.
- Offers "Continue or Exit: " prompt after each move.
- Human player selects Rock.
- Computer selects Scissors.
- Computer won this round. Overall score is 4.
- Prompts "Continue or Exit:" after each move.
- ...
Rock Paper Scissors (Java Swing)
A simple, complete implementation of the classic two-player game, Rock, Paper, Scissors, built using Java's Swing toolkit. This project separates the game logic (backend) from the graphical user interface (frontend) for clear architecture and easy maintenance.

🚀 Key Features
Interactive Swing GUI with score tracking for the player and computer.
Real-time score update after every round.
Randomized computer choice per round, managed by the backend.
Clear separation of UI components (RockPaperScissorGUI) and game rules (RockPaperScissor).

📁 Project Structure
The application is split into three main Java files within the RockPaperScissor package:
App.java: Role: Launcher. Main class containing the main method, responsible for launching the GUI.
RockPaperScissorGUI.java: Role: Frontend. Handles all GUI elements (buttons, labels) and user interactions.
RockPaperScissor.java: Role: Backend. Manages game logic, random choice generation, and score calculation.

⚙️ How to Run
This is a standard Java application and can be run from any Java IDE (like IntelliJ, Eclipse, or VS Code) or the command line.

Using Command Line
Navigate to the directory containing the RockPaperScissor package folder.
Compile the source files:
javac RockPaperScissor/*.java

Run the application using the App launcher class:
java RockPaperScissor.App

Using an IDE
Create a new Java project in your IDE.
Create a package named RockPaperScissor.
Place all three .java files inside this package.
Run the App.java file.

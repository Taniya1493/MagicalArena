# MagicalArena

MagicalArena is a simple Java-based game where two players fight in a magical arena until one of them loses all their health.

## Table of Contents

- [Features](#features)
- [How to Run](#how-to-run)
- [Design Choices](#design-choices)
- [Commit History](#commit-history)
- [Tests](#tests)

## Features

- Two players battle in an arena.
- Each player has attributes: health, strength, and attack.
- The battle continues until one player's health reaches zero.
- Random dice rolls determine the outcome of attacks and defenses.

## How to Run

1. Ensure you have JDK 8 or higher installed.
2. Download and extract the ZIP file containing the project.
3. Navigate to the extracted project directory.
4. Compile the code:
    ```sh
    javac -d out -sourcepath src/main/java src/main/java/org/magicalarena/*.java
    ```
5. Run the game:
    ```sh
    java -cp out org.magicalarena.Game
    ```

## Design Choices

- `Player`: Represents a player with health, strength, and attack attributes.
- `Dice`: Simulates a 6-sided dice roll.
- `MagicalArena`: Manages the game logic, including turn-based combat between two players.
- `Game`: Entry point to start the game.

## Commit History

Frequent commits with relevant messages for incremental development and better traceability.
To view the commit history of this project, follow these steps:
1. Navigate to the project directory in your terminal.
2. Use the following Git command to view the commit history:
   ```sh
    git log --oneline
    ```

## Tests

To run the tests, execute the following Maven command:
```sh
mvn test

# Character Game Simulation in Java (Alternative Version)
This project is an alternative version of the previous character interaction simulation, developed as part of a Java programming course. It builds upon the original project by introducing new features and improvements, such as user input for character names, randomized health values, and a more interactive gameplay loop. The goal remains to demonstrate object-oriented programming concepts, including class design, encapsulation, and basic game mechanics.

## Key Features
- **Interactive Character** Creation: Users can input names for the characters (e.g., a sorcerer and a gladiator).

- **Randomized Health**: Characters start with randomized health values within a specified range.

- **Gameplay Loop**: Players can choose actions (attack, heal, or do nothing) in a turn-based system.

- **Health Management**: Characters can heal using a potion, which restores a random amount of health.

- **Attack Mechanism**: Characters can attack each other, with damage calculated randomly.

- **Winner Determination**: The game determines the winner based on the remaining health of the characters.

## Changes from the Previous Version
1. User Input for Character Names:
    - In this version, the user can input names for the sorcerer and the gladiator, making the game more personalized.

2. Randomized Health Values:
    - Characters now start with randomized health values within a specified range (75-100 for the sorcerer, 75-125 for the gladiator), adding variability to each game session.

3. Interactive Gameplay Loop:
    - The game now features a turn-based system where the player can choose actions (attack, heal, or do nothing) in each turn, making the gameplay more engaging.

4. Healing with Potions:
    - A new Potion method allows characters to heal by consuming a potion, which restores a random amount of health (between 10 and 50).

5. Simplified Attack Mechanism:
    - The attack mechanism has been simplified. When a character attacks, only the target loses health, unlike the previous version where both the attacker and the target took damage.

6. Winner Determination:
    - At the end of the game, the winner is determined based on who has more health remaining, providing a clear conclusion to the gameplay.

## Example Usage
```
// Example of gameplay loop
System.out.println("Veuillez choisir votre action : \n" +
                   "1 - Attaquer \n" +
                   "2 - Se soigner \n" +
                   "3 - Ne rien faire \n");

// Player chooses an action, and the game progresses accordingly.
```

## Project Structure
- **Personnage.java**: Contains the `Personnage` class with methods for character creation, health management, attacks, and healing.

- **jeuPersonnage.java**: The main game class that handles user input, gameplay logic, and turn-based interactions between characters.

## About This Project
This project is an enhanced version of the previous character interaction simulation, developed as part of a Java programming course. It introduces new features such as user input, randomized health, and an interactive gameplay loop, making it more engaging and dynamic. The goal is to provide a practical example of how to model turn-based game mechanics and character interactions in Java.
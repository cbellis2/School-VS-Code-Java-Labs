import java.util.Scanner;

public class RPSLS {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        // Enable test mode for CodeGrade
        System.out.println("Enable test mode? (yes/no): ");
        boolean testMode = keyboard.nextLine().equalsIgnoreCase("yes");

        // User directions
        System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock!");
        System.out.println("Enter your choice: ");
        System.out.println("(0) for Rock");
        System.out.println("(1) for Paper");
        System.out.println("(2) for Scissors");
        System.out.println("(3) for Lizard");
        System.out.println("(4) for Spock");

        // User's choice
        int player = keyboard.nextInt();

        // Computer's choice
        int computer;
        if (testMode) {
            computer = 0; //Fixed number for test mode
        } else {
            computer = (int) (Math.random() * 5); //Random number between 0 and 4
        }
        
        // Player's choice
        switch (player) {
            case 0:
                System.out.println("You played Rock.");
                break;
            case 1:
                System.out.println("You played Paper.");
                break;
            case 2:
                System.out.println("You played Scissors.");
                break;
            case 3:
                System.out.println("You played Lizard.");
                break;
            case 4:
                System.out.println("You played Spock.");
                break;
            default:
                System.out.println("Invalid choice! Please restart the game.");
                keyboard.close();
                return; // Exit the program if the input is invalid
        }

        // Display the computer's choices
        switch (computer) {
            case 0 -> System.out.println("The computer played Rock.");
            case 1 -> System.out.println("The computer played Paper.");
            case 2 -> System.out.println("The computer played Scissors.");
            case 3 -> System.out.println("The computer played Lizard.");
            case 4 -> System.out.println("The computer played Spock.");
        }

        // Determine the outcome
        if (player == computer) {
            System.out.println("It is a draw!");
        } 
        // Rock
        else if (player == 0) {
            if (computer == 1) {
                System.out.println("Paper covers Rock, the computer wins!");
            } else if (computer == 2) {
                System.out.println("Rock crushes Scissors, you win!");
            } else if (computer == 3) {
                System.out.println("Rock crushes Lizard, you win!");
            } else if (computer == 4) {
                System.out.println("Spock vaporizes Rock, the computer wins!");
            }
        }
        // Paper
        else if (player == 1) {
            if (computer == 0) {
                System.out.println("Paper covers Rock, you win!");
            } else if (computer == 2) {
                System.out.println("Scissors cut Paper, the computer wins!");
            } else if (computer == 3) {
                System.out.println("Lizard eats Paper, the computer wins!");
            } else if (computer == 4) {
                System.out.println("Paper disproves Spock, you win!");
            }
        }
        // Scissors
        else if (player == 2) {
            if (computer == 0) {
                System.out.println("Rock crushes Scissors, the computer wins!");
            } else if (computer == 1) {
                System.out.println("Scissors cut Paper, you win!");
            } else if (computer == 3) {
                System.out.println("Scissors decapitate Lizard, you win!");
            } else if (computer == 4) {
                System.out.println("Spock smashes Scissors, the computer wins!");
            }
        }
        // Lizard cases
        else if (player == 3) {
            if (computer == 0) {
                System.out.println("Rock crushes Lizard, the computer wins!");
            } else if (computer == 1) {
                System.out.println("Lizard eats Paper, you win!");
            } else if (computer == 2) {
                System.out.println("Scissors decapitate Lizard, the computer wins!");
            } else if (computer == 4) {
                System.out.println("Lizard poisons Spock, you win!");
            }
        }
        // Spock
        else if (player == 4) {
            if (computer == 0) {
                System.out.println("Spock vaporizes Rock, you win!");
            } else if (computer == 1) {
                System.out.println("Paper disproves Spock, the computer wins!");
            } else if (computer == 2) {
                System.out.println("Spock smashes Scissors, you win!");
            } else if (computer == 3) {
                System.out.println("Lizard poisons Spock, the computer wins!");
            }
        }
        
        // Close scanner
        keyboard.close();

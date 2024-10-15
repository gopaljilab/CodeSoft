import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a random object for the Random Number
        Random random = new Random();

        // Define the Boundries Limit For the Range of Number
        int lowerBound = 1;
        int upperBound = 100;

        // Get a Number Within The Specified Range
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1);
        int attempts = 0;
        int maxAttempts = 10;
        System.out.println("Welcome To The Number Guessing World");
        System.out.println("I have Selected A number Between "+ lowerBound + " And " + upperBound);
        System.out.println("Can You Guess It?");

        while(attempts < maxAttempts){
            System.out.println("Enter Your Guess Number ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == numberToGuess){
                System.out.println("Congratulations! You've Guess The Correct Number in "+attempts+ " attempts.");
                break;
            }
            else if(userGuess < numberToGuess){
                System.out.println("Just Missed!, Try a Higher Guess Number");
            }
            else {
                System.out.println("Just Missed!, Try a Lower Guess Number");
            }
            if (userGuess > 100 || userGuess < 1){
                System.out.println("Sorry, Please Enter The Specified Number");
            }
        }
        if (attempts == maxAttempts){
            System.out.println("Sorry, You Reached the Maximum Number Of Attempts");
            System.out.println("The Correct Number is "+ numberToGuess);
        }

    }
}

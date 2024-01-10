import java.util.Scanner; // Imports scanner to get the number user guesses
import java.util.Random; // Imports random to generate a random number
public class HigherOrLower
{
    public static void main(String[] args)
    {
        Random randomNumber = new Random();
        int cpuNumber = randomNumber.nextInt(101); // Generate number 0 - 100
        System.out.println("Guess a number between 0 and 100!");
        Scanner user = new Scanner(System.in);
        int userNumber = user.nextInt(); // Get the user's first guess
        while (userNumber != cpuNumber) // While they haven't guessed correctly...
        {
            if (userNumber < cpuNumber) // If it's too low...
            {
                System.out.println("Nope- Higher!");
            }
            else if (userNumber > cpuNumber) // If it's too high...
            {
                System.out.println("Nope- Lower!");
            }
            userNumber = user.nextInt(); // User keeps guessing until they're correct
        }
        System.out.println("You got it! The correct number was " + cpuNumber + ".");
    }
}
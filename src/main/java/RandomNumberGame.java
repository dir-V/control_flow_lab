import java.util.Scanner;
import java.util.Random;
public class RandomNumberGame {
    public static void main(String[] args) {
        System.out.println("I am thinking of a number between 1 and 10, guess what it is. You have three guesses.");
//      Creating random number generator between 1 and 10
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean correct = false;
        int tries = 3;

//        Adds a do while loop which keeps running while the user has tries available.
//        Once the user runs out a tries a message or guesses correctly, the loop will stop.
             do {
                 Scanner reader = new Scanner(System.in);
                 System.out.println(tries + " Guesses left:");
                 int guess = reader.nextInt();
                 if (guess == randomNumber) {
                     System.out.println("You guessed correct!");
                     break;
                 } else if (guess > randomNumber) {
                     System.out.println("Wrong! Hint: It's lower!");
                     tries--;
                 } else {
                     System.out.println("Wrong! Hint: Its higher!");
                     tries--;
                 }
             }
            while (tries != 0);
            if (tries == 0){
                System.out.println("You ran out of guesses! The number was " + randomNumber);
            }


    }
}

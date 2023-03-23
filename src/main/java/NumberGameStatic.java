import java.util.Scanner;
public class NumberGameStatic {
    public static void main(String[] args) {
//      User input prompt
        System.out.println("I am thinking of a number between 1 and 10. Try and guess what it is!");

//      Declaring scanner and number variable
        int number = 7;
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();

//      if statement which indicates whether the guessed number is higher or lower than number variable
        if (guess > number){
            System.out.println("Wrong! (Hint: It's lower!)");
        } else if (guess < number) {
            System.out.println("Wrong! (Hint: It's higher!)");
        }else{
            System.out.println("Well done! You guessed it!");
        }
    }
}

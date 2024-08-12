import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game\n");
        //System.out.print("Pleast enter the number : ");
        int num = 5;

        int guess;

        do {
            System.out.print("Please enter the guessing num between 0 to 10: ");
            guess = input.nextInt();
        }while( num != guess);

        System.out.println("You have successfully guessed the number ");
    }
}

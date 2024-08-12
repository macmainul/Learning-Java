import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame()  {
        random = (int)Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNum  is the number that guessed by player
     * @return
     *  - Negative if the guessed num is smaller
     *  + Positive if the guessed num is
     *   0 if the guessed num is correct
     */
    int guess (int guessNum)    {
        return guessNum - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("where you can guessed a number between 1 to 100\n");

        GuessingGame game = new GuessingGame();
        int guess;
        int result;

        do {
            System.out.print("Please guess a number : ");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0) System.out.println("Congratulation !!! You successfully guessed the number");
            if(result < 0) System.out.println("Please Guess Higher");
            else if(result > 0) System.out.println("Please Guess Lower");
        }while(result != 0);

    }
}

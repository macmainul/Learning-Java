import java.util.Scanner;

class ScoreCategorize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to score categorize  using ternary operator\n");
        System.out.print("Please enter the score : ");
        int first = input.nextInt();

        String result = first > 80 ? "High" : (first > 50 ? "Moderate" : "Low");
        System.out.println("Your category is : " + result);
    }
}

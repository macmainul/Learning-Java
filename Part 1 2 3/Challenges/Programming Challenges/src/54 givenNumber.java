import java.util.Scanner;

class givenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to even odd finder  using ternary operator");
        System.out.println();
        System.out.print("Please enter the number : ");
        int first = input.nextInt();

        String result = first % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is : "+ result);
    }
}

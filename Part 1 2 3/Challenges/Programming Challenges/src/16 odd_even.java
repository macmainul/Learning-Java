import java.util.Scanner;

class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odd/Even finding programme");

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if(num % 2 == 0)    {
            System.out.println("The num is Even");
        }else {
            System.out.println("The num is odd");
        }
    }
}

import java.util.Scanner;

public class Input_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two int number: ");
        int a = input.nextInt();
        int b = input.nextInt();

        //int c = a + b;
        //System.out.println("Sum of those two number is : " +c);

        System.out.println("Sum of those two number is : " +(a+b));
    }
}

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to test file ");
        System.out.print("Enter a number for testing function : ");

        int num = input.nextInt();
        printf(num);
    }

    public static void printf(int n)    {
        System.out.println("your number is " + n);
    }
}

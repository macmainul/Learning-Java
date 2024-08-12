import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci calculator ");
        System.out.print("Enter the number : ");
        int fib = input.nextInt();

        fibonacci(fib);
    }

    public static void fibonacci(int num)   {
        int first = 0, second = 1;
        System.out.print("0 ");
        if(num == 0)    return;
        System.out.print("1 ");
        if(num == 1)    return;

        int third = first + second;

        while(third <= num) {
            System.out.print(third+" ");
            first = second;
            second = third;
            third = first + second;
        }
    }
}

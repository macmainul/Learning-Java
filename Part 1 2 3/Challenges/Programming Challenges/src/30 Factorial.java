import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to factorial calculator");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        long answer = factorial(num);

        System.out.println("Factorial of "+num+" is = "+answer);

    }

    public static long factorial(int num)   {
        int i=1;
        long ans = 1;
        while (i <= num)    {
            ans *= i;
            i++;
        }
        return ans;
    }
}

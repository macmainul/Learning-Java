import java.util.Scanner;

class sum_of_all_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to digit sum of a number Calculator");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        long d_sum = digit_sum(num);

        System.out.println(" Sum of all digit of number " +num+" is "+ d_sum);
    }

    public static long digit_sum(int num)   {
        int i = num;
        long sum = 0;
        while (i != 0)
        {
           sum += i % 10;
           i = i /10;
        }

        return sum;
    }
}

import java.util.Scanner;

class revese_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to digit reversr calculator ");
        System.out.print("Enter the first number : ");
        int num = input.nextInt();

        int reversse = reverse(num);

        System.out.println("Reverse of "+num+" is "+reversse);
    }

    public static int reverse(int num)  {
        int reverse = 0;
        while(num !=0)  {
            int digit = num % 10;
            reverse = (10 * reverse) + digit;
            num /= 10;
        }
        return reverse;
    }
}

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to gcd calculator ");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();

        int lcm = LCM(first,second);

        System.out.println("LCM = "+ lcm);
    }

    public static int LCM(int num1,int num2)    {
        int i=1;
        while (true)
        {
            if((num1 * i) % num2 == 0)
            {
                return (num1 * i);
            }
            i++;
        }
    }
}

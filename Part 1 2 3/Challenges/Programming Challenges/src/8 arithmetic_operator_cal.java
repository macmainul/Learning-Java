import java.util.Scanner;

class arithmetic_operator_cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A = ");
        int a = input.nextInt();
        System.out.print("Enter B = ");
        int b = input.nextInt();

        System.out.println("\n\n Now showing all arithmetic calculation \n");
        System.out.println("A + B = " +(a+b));
        System.out.println("A - B = " +(a-b));
        System.out.println("A * B = " +(a*b));
        System.out.println("A / B = " +(a/b));
        System.out.println("A % B = " +(a%b));

    }
}

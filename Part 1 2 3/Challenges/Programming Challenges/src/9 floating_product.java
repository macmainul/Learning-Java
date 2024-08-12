import java.util.Scanner;

class floating_product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Floating calculator ");

        System.out.print("Enter first floating number A = ");
        float a = input.nextFloat();

        System.out.print("Enter second floating number B = ");
        float b = input.nextFloat();

        System.out.println("Product of those floating number A * B = " +(a*b));
    }
}
